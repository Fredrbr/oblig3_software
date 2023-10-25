# oblig3_software

Siden vi skulle bruke testene fra oblig2 så lagde jeg en ny repository gjennom oblig2 prosjektet og refaktored navnet til oblig3

Nå som jeg hadde prosjektet oppe, så kan jeg lage mappene .github -> workflows -> run-tests.yaml
legger til on push og pull requests, satt opp JDK (Jeg har JDK version 21.0.1) så jeg brukte denne versjonen, 
når jeg søkte opp hvilken versjon som github actions var kompatibel med, så sto det v.17 (Hadde ingen problemer med 21, så forventet at det gikk greit).

Satt opp Maven og tests.

Kjørte 3 commit and push til github for å se om det fungerte.

Problemer:
-Run Test med maven klarte ikke å finne testene mine, dette var fordi at test klassen min het "testing" og i følge github actions Junit, så må den ende me "Test".
Så jeg gjorde om klasse navnet til "LeapYearTest" og det fungerte med engang.

