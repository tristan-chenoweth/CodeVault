def read_sudoku_from_file(filename):
    # Read the Sudoku puzzle from the input file.
    with open(filename, 'r') as file:
        puzzle = []
        for line in file:
            row = [int(x) for x in line.strip().split(',')]
            puzzle.append(row)
    return puzzle

def input_sudoku_manually():
    print("Enter the Sudoku puzzle one row at a time.")
    print("Seperated by commnas, and use '0' for empty cells")
    puzzle = []
    for row_number in range(1, 10):
         while True:
            row_input = input(f"Enter row {row_number}: ").strip().split(',')
            if len(row_input) != 9:
                print("Invalid input. Please enter exactly 9 numbers separated by commas.")
            else:
                try:
                    row = [int(x) for x in row_input]
                    if all(0 <= num <= 9 for num in row):
                        puzzle.append(row)
                        break
                    else:
                        print("Invalid input. Please enter numbers between 0 and 9.")
                except ValueError:
                    print("Invalid input. Please enter only numeric values.")
    return puzzle

def is_valid_move(board, row, col, num):
    # Check if it's valid to place 'num' in board[row][col].
    for i in range(9):
        if board[row][i] == num or board[i][col] == num:
            return False

    start_row, start_col = 3 * (row // 3), 3 * (col // 3)
    for i in range(start_row, start_row + 3):
        for j in range(start_col, start_col + 3):
            if board[i][j] == num:
                return False

    return True

def solve_sudoku(board):
    for row in range(9):
        for col in range(9):
            if board[row][col] == 0:
                for num in range(1, 10):
                    if is_valid_move(board, row, col, num):
                        board[row][col] = num
                        if solve_sudoku(board):
                            return True
                        board[row][col] = 0
                return False
    return True

def write_sudoku_to_file(board, filename):
    # Write the solved Sudoku puzzle to the output file.
    with open(filename, 'w') as file:
        for row in board:
            line = ','.join(map(str, row))
            file.write(line + '\n')

if __name__ == "__main__":
    print("Sudoku Solver")
    print("1. Solve Sudoku from a file (comma delimited, no spaces.)")
    print("2. Input Sudoku manually")
    choice = input("Enter your choice (1 or 2 or Any other input to quit): ")

    if choice == "1":
        input_file = input("Enter the file path of the Sudoku puzzle: ").strip('"')
        sudoku_board = read_sudoku_from_file(input_file)
    elif choice == "2":
        sudoku_board = input_sudoku_manually()
    else:
        print("No choice selected stopping....")
        exit()

    if sudoku_board:
        input_file = "userManualInput_sudoku.txt"
        write_sudoku_to_file(sudoku_board, input_file)
        print("Sudoku puzzle saved to", input_file)
    
    sudoku_board = read_sudoku_from_file(input_file)
    
    if solve_sudoku(sudoku_board):
        output_file = input_file.replace('.txt', '_solved.txt')
        write_sudoku_to_file(sudoku_board, output_file)
        print("Sudoku solved and saved in", output_file)
    else:
        print("No solution found for the Sudoku puzzle.")