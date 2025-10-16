# Import tkinter for GUI operation and creation
import tkinter as t

def on_exit_button_click():
    root.quit()

# Define buttons for numbers and operations
button_texts = [
    '7', '8', '9', '/',
    '4', '5', '6', '*',
    '1', '2', '3', '-',
    '0', '.', '=', '+',
    'Exit'
]

# Create and place the buttons on the GUI
row_val = 1
col_val = 0

root = t.Tk()

for button_text in button_texts:
    t.Button(root, text=button_text, padx=20, pady=20, command=lambda b=button_text: button_click(b)).grid(row=row_val, column=col_val)
    col_val += 1
    if col_val > 3:
        col_val = 0
        row_val += 1

root.title("Simple Calculator")


#exitButton = t.Button(root, text="Exit", command=on_exit_button_click)

#exitButton.pack()

# Run GUI using tkinter and load window
root.mainloop()