import pygame
import sys
import random

# Initialize Pygame
pygame.init()

# Constants
WIDTH, HEIGHT = 800, 600
WHITE = (255, 255, 255)
BALL_SPEED = 5
PADDLE_SPEED = 10

# Create the game window
window = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Pong Game - Press R to reset")

# Create the paddles and ball
player_paddle = pygame.Rect(WIDTH // 2 - 50, HEIGHT - 20, 100, 10)
ball = pygame.Rect(WIDTH // 2 - 15, HEIGHT // 2 - 15, 30, 30)
ball_speed = [random.choice([-BALL_SPEED, BALL_SPEED]), BALL_SPEED]

  

# Initial countdown variables

initial_countdown_font = pygame.font.Font(None, 36)

initial_countdown_timer = 3

initial_countdown_active = True

  # Countdown variables
countdown_font = pygame.font.Font(None, 36)
countdown_timer = 3
countdown_active = False

# Bounce counter variables
bounce_font = pygame.font.Font(None, 24)
bounce_counter = 0

# High score variables
high_score_font = pygame.font.Font(None, 24)
high_score = 0

# Game over variables
game_over_font = pygame.font.Font(None, 72)
game_over_text = None
game_over_active = False

# Freeze ball movement
freeze_ball = False

# Game loop
while True:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()
            sys.exit()
        elif event.type == pygame.KEYDOWN and event.key == pygame.K_r:
            # Reset the game on 'R' key press
            player_paddle.x = WIDTH // 2 - 50
            ball.x = WIDTH // 2 - 15
            ball.y = HEIGHT // 2 - 15
            initial_countdown_timer = 3
            initial_countdown_active = False
            countdown_timer = 3
            countdown_active = True
            bounce_counter = 0
            game_over_active = False
            game_over_text = None
            ball_speed = [random.choice([-BALL_SPEED, BALL_SPEED]), BALL_SPEED]
            freeze_ball = False
    keys = pygame.key.get_pressed()
    
    # Move the paddle and restrict it within the window bounds
    player_paddle.x += (keys[pygame.K_RIGHT] - keys[pygame.K_LEFT]) * PADDLE_SPEED
    player_paddle.x = max(0, min(player_paddle.x, WIDTH - player_paddle.width))

    # Initial countdown logic
    if initial_countdown_active:
        initial_countdown_text = initial_countdown_font.render(
            f"Get ready! {initial_countdown_timer}", True, (0, 0, 0)
        )
        window.blit(initial_countdown_text, (WIDTH // 2 - 70, HEIGHT // 2 - 10))
        pygame.display.flip()
        pygame.time.delay(1000)  # Delay for one second
        initial_countdown_timer -= 1

        if initial_countdown_timer == 0:
            initial_countdown_active = False
            countdown_active = True

    # Countdown logic
    elif countdown_active:
        countdown_text = countdown_font.render(str(countdown_timer), True, (0, 0, 0))
        window.blit(countdown_text, (WIDTH // 2 - 10, HEIGHT // 2 - 10))
        pygame.display.flip()
        pygame.time.delay(1000)  # Delay for one second
        countdown_timer -= 1

        if countdown_timer == 0:
            countdown_active = False

    # Move the ball if not frozen
    if not freeze_ball:
        ball.x += ball_speed[0]
        ball.y += ball_speed[1]

    # Ball collisions with walls
    if ball.left <= 0 or ball.right >= WIDTH:
        ball_speed[0] = -ball_speed[0]

    if ball.top <= 0:
        ball_speed[1] = -ball_speed[1]

    # Ball collision with paddles
    if ball.colliderect(player_paddle) and ball_speed[1] > 0:
        ball_speed[1] = -ball_speed[1]
        bounce_counter += 1

        # Update high score if necessary
        if bounce_counter > high_score:
            high_score = bounce_counter

    # Check for game over
    if ball.bottom >= HEIGHT:
        game_over_active = True
        game_over_text = game_over_font.render("Game Over", True, (255, 0, 0))
        freeze_ball = True  # Freeze the ball on game over

    # Draw everything
    window.fill(WHITE)
    pygame.draw.rect(window, (0, 0, 255), player_paddle)
    pygame.draw.ellipse(window, (255, 0, 0), ball)

    # Draw bounce counter
    bounce_text = bounce_font.render(f"Bounces: {bounce_counter}", True, (0, 0, 0))
    window.blit(bounce_text, (10, 10))

    # Draw high score
    high_score_text = high_score_font.render(f"High Score: {high_score}", True, (0, 0, 0))
    window.blit(high_score_text, (WIDTH - 130, 10))

    # Draw game over message
    if game_over_active:
        window.blit(game_over_text, (WIDTH // 2 - 150, HEIGHT // 2 - 50))

    # Update the display
    pygame.display.flip()

    # Cap the frame rate
    pygame.time.Clock().tick(60)

