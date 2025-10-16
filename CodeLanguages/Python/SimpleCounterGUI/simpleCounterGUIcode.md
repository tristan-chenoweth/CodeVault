```python
# Import tkinter for GUI operation and creation
import tkinter as t

# Import methods from tkinter
from tkinter import font as f

# Set global variable for counters
count = 0 
addButtonPressCount = 0
doubleButtonPressCount = 0
resetButtonPressCount = 0

# Define onAddButtonClick function
def onAddButtonClick():

    # Call global count variable for use
    global count
    global addButtonPressCount

    # Adjust count variable to add 1
    count += 1
    addButtonPressCount += 1

    # Adjust counter label to inform of button clicked and counter change
    counterLabel.config(text=f"Adding 1...", font=customFont)
    counterWindowLabel.config(text=f"Count at {count}", font=customFont2)

    # Print information to console for troubleshooting (uncomment the following 3 lines to see information in console)
    #print("Add 1 button pressed.")
    #print(f"User display count at: {count}")
    #print(f"Add Button clicked {addButtonPressCount} times")
 
# Define onDoubleButtonClick function
def onDoubleButtonClick():

    # Call global count variable for use
    global count
    global doubleButtonPressCount

    # Print information to console for troubleshooting (uncomment the following 2 lines to see information in console)
    #print("Double button pressed.")
    #print(f"User display count at: {count} before doubling")

    # Adjust count to double current count value
    count = count * 2 
    doubleButtonPressCount += 1

    # adjust counter label to new count value
    counterLabel.config(text=f"Doubling...", font=customFont)
    counterWindowLabel.config(text=f"Count at {count}", font=customFont2)

    # Print information to console for troubleshooting (uncomment the following 2 lines to see information in console)
    # print(f"User display count at: {count} after doubling")
    # print(f"Double Button clicked {doubleButtonPressCount} times")

# Define on_reset_button_click function
def onResetButtonClick(): 

    # Call gloal count variable for use
    global count
    global resetButtonPressCount

    # Set count to 0 for reset
    count = 0
    resetButtonPressCount += 1

    # Adjust counter label to inform of reset
    counterLabel.config(text=f"Resetting...", font=customFont)
    counterWindowLabel.config(text=f"Count at {count}", font=customFont2)

    # Print information to console for troubleshooting (uncomment the following 3 lines to see information in console)
    #print("Counter reset by button")
    #print(f"User display count at: {count}")
    #print(f"Reset Button clicked {resetButtonPressCount} times")

# Define on_exit_button_click function
def onExitButtonClick():

    # Print information to console for troubleshooting (uncomment the following 5 lines to see information in console)
    #print(f"Add button presses: {addButtonPressCount}")
    #print(f"Double button presses: {doubleButtonPressCount}")
    #print(f"Reset button presses: {resetButtonPressCount}")
    #print(f"Total button presses: {addButtonPressCount + doubleButtonPressCount + resetButtonPressCount + 1}")
    #print("Code Terminated by Exit button.")

    # Send quit to GUI to close window and exit program
    root.quit()

# Create tkinter object to load GUI
root = t.Tk()
counter = t.Toplevel(root)

# Title new windows
root.title("Simple GUI")
counter.title("Counter")

# Define custom font sizes
customFont = f.Font(size=18)
customFont2 = f.Font(size=20,weight="bold")

# Adjust other properties of windows
root.minsize(250,250)
counter.minsize(200,100)

# Define all labels used in windows
counterLabel = t.Label(root, text="Hello, User!", font=customFont)
counterWindowLabel = t.Label(counter, text="Hello, User!", font=customFont2)
mainlabel = t.Label(root, text="To add 1 to counter: Click Add 1")
labelReset = t.Label(root, text="To reset counter: Click Reset.")
labelExit = t.Label(root, text="To exit Program: Click Exit.")

# Define all buttons used in windows
add1button = t.Button(root, text="Add 1", command=onAddButtonClick)
doubleButton = t.Button(root, text="Double Count", command=onDoubleButtonClick)
resetButton = t.Button(root, text="Reset", command=onResetButtonClick)
exitButton = t.Button(root, text="Exit", command=onExitButtonClick)

# Load all assets to window
counterLabel.pack()
counterWindowLabel.pack()
add1button.pack()
mainlabel.pack()
doubleButton.pack()
labelReset.pack()
resetButton.pack()
labelExit.pack()
exitButton.pack()

# Run GUI using tkinter and load window
root.mainloop()
```


