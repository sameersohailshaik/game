import random

# Generate a random number between 1 and 100
secret_number = random.randint(1, 100)

# Set the number of guesses to 0
num_guesses = 0

# Prompt the player to guess the number
while True:
    guess = int(input("Guess a number between 1 and 100: "))
    num_guesses += 1
    
    # Check if the guess is correct
    if guess == secret_number:
        print("Congratulations, you guessed the number in", num_guesses, "guesses!")
        break
    
    # Give a hint to the player if the guess is too high or too low
    elif guess < secret_number:
        print("Too low, try again!")
    else:
        print("Too high, try again!")

