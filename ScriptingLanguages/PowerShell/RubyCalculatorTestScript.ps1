# Define test cases with expected outputs
$testCases = @(
    # Test for Addition function
    @{ input = "a`n5`n3`nq"; expected = "Result: 8" } 

    # Test for Subtraction function
    @{ input = "s`n10`n4`nq"; expected = "Result: 6" }

    # Test for Multiplication function
    @{ input = "m`n6`n7`nq"; expected = "Result: 42" }

    # Test for Division function
    @{ input = "d`n9`n3`nq"; expected = "Result: 3.0" }

    # Test for Division by 0 error handling
    @{ input = "d`n8`n0`nq"; expected = "Error: Division by zero" }

    # Test for Exponential function
    @{ input = "e`n2`n3`nq"; expected = "Result: 8" }

    # Test for Modulus function
    @{ input = "o`n10`n3`nq"; expected = "Result: 1" }

    # Test for Factorial function
    @{ input = "f`n5`nq"; expected = "Result: 120" }

    # Test for Invalid Operator error handling
    @{ input = "x`n19`n4`nq"; expected = "Invalid operator" }
)

# Path to Ruby script
$rubyScriptPath = "..\..\CodeLanguages\Ruby\Calculator\calculator.rb"

foreach ($test in $testCases) {
    Write-Host "`nRunning test with input:`n$($test.input)"

    # Capture output from Ruby script
    $actualOutput = $test.input | ruby $rubyScriptPath 2>&1

    Start-Sleep -Milliseconds 500

    # Find the line containing the result
    $filteredOutput = $actualOutput | Select-String -Pattern "Result:|Error:|Invalid|Restarting"

    if ($filteredOutput -match $test.expected) {
        Write-Host "Test Passed!`nExpected: '$($test.expected)'`nGot: '$filteredOutput'"
    } else {
        Write-Host "Test Failed!`nExpected: '$($test.expected)'`nActual:   '$filteredOutput'"
    }
    Start-Sleep -Milliseconds 500
}
