const characters = "abcdefghijklmnopqrstuvwxyz";

const desiredCharacter = "a";

function characterExists(characters, desiredCharacter) {
  let characterExists = false;

  for (let i = 0; i < characters.length; i++) {
    if (characters[i] === desiredCharacter) {
      characterExists = true;
      break;
    }
  }

  return characterExists;
}

console.log(
  "Character " +
    desiredCharacter +
    (characterExists(characters, desiredCharacter)
      ? " exists."
      : " doesn't exist."),
);
