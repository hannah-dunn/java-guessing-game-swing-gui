# ⭐ Number Guessing Game ⭐

## Demo & Snippets

![Screenshot (3277)](https://github.com/hannah-dunn/java-guessing-game-swing-gui/assets/114053793/a93b8ba0-388d-47c5-b087-ded5e7f2325e)
![Screenshot (3271)](https://github.com/hannah-dunn/java-guessing-game-swing-gui/assets/114053793/78c099dd-020c-4849-8a94-d47433087c63)

## Features

- The application randomly generates a number between 1 and 1000
- The user is prompted to 'Guess what number I'm thinking:' and type a number into a field at the top of the app
- The user is prompted to guess either a higher or lower number to match the target randomly generated number
- Upon getting the correct guess, the user is congratulated and the number of guess attempts is listed

---

## Purpose

- Create a simple Java app from scratch, nothing too complex to be able to learn Java Swing GUI
- Take a user's input and print both their input and a game response in the GUI

---

## Design Goals / Approach

- Started with a two-panel design with guessField and outputField being side by side
![Screenshot (3273)](https://github.com/hannah-dunn/java-guessing-game-swing-gui/assets/114053793/1cbb372a-31fa-494f-b9dd-458aecbb1094)
- I wanted something very basic for this first attempt at Swing GUI, so I was happy with black text on the white, clear to read and see what the intention of the function was
- I researched into changing the background colours, borders and even adding photos as a background, but at least for this project I felt it would've busied it up too much and was making the text unreadable, which wouldn't work for the text-based 'game'
- I also ran into the issue of the guessField continuously wanting to be bigger than the outputField, which doesn't make design sense with the input guess ideally being four characters max
- The scroll also was not happy for a while, leading me to have a design
![Screenshot (3274)](https://github.com/hannah-dunn/java-guessing-game-swing-gui/assets/114053793/c213e908-8c70-44bc-a46e-5a8e4c113e1a)


---

## Known issues

- Not necessarily a huge issue but the submit button has to be manually clicked, cannot submit guess with the enter key
- It's relatively small on the screen, but I don't think it's interesting enough to follow further for more intricate designs at this stage

---

## Future Goals

- Next up is adding testing, obviously
- I'm looking into hosting the app through https://www.webswing.org/en maybe? Researching currently

---

## Further details, related projects, reimplementations

- This is a further implementation of https://github.com/hannah-dunn/java-number-guessing-game which works only in the Java console
