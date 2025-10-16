; Hello World program in NASM for Linux

section .data
    message db 'Hello, World!', 10    ; 10 is the ASCII code for a new line (LF)
    message_length equ $ - message

section .text
    global _start

_start:
    ; Write the message to stdout
    mov eax, 4              ; System call number for sys_write
    mov ebx, 1              ; File descriptor 1 is stdout
    mov ecx, message        ; Address of the message
    mov edx, message_length ; Length of the message
    int 0x80                ; Make system call

    ; Exit the program
    mov eax, 1              ; System call number for sys_exit
    xor ebx, ebx            ; Return 0 status
    int 0x80                ; Make system call