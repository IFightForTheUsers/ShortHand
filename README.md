# ShortHand
Convert long names to 'firstLetter_numberOfLettersInBetween_lastLetter' style (like K8s, or a16z)

Examples: <br/>
Kubernetes -> K8s <br/>
AndreessenHorowitz -> A16z

I have it set up to be whitespaace delimited, so you can do multiple names at once. For example, if you wanted to change the style up to apply the ShortHand algorithm to first name and last name separately, 'Andreessen Horowitz' (with the space between) would become 'A8n H6z'. 

Trick: Kick the space if you don't want it to delimit the entire string. (Example: to get a16z, enter andreessenHorowitz)

Have fun!
