# prrr
-Esquema principal del projecte:
  1. crear un taulell buit o crear un taulell que ja tingui malalts.
  2. opcionalment pots afegir malalts a la posició que tu vulguis del taulell.
  3. donat un percentatge, calculem la taxa de transmissió de tot el taulell menys les posicions que no tinguin malalts.
  4. segons el que vulgui l'usuari podrà curar malalts a tot el taulell o a una posició concreta, i els curats es fara mitjançan un percentatje random o especific i tambe
  un valor concret.
  5. l'usuari podra desplaçar x malalts de una posicio a una altre mitjançan amb les lletres del teclat.
  6.
  7.
  8.
  
-Explicació de decisions de disseny:
  -primer de tot em agut de crear dos variables que es diuen files i columnes, per desprès utilitzar-les en un for per poder anar posició per posició del taulell.
  -desprès em agut de crear un array per poder emmagatzemar les posicions del taulell que va regit per files i columnes.
  -per cada punt del projecte em agut de printar si volia fer-ho, desprès em agut de crear les corresponents variables per a la resposta de l'usuari.
  -per introduir malalts em agut de crear dos for, un per les files i l'altre per les columnes i a cada posició igualar l'array taulell al número de persones que vol l'usuari
    i després printar el taulell.
  -per fe el punt de transmetre virus em agut de fer el càlcul i igualar les posicions del taulell a aquest càlcul, i així per cada posició del taulell el número que hi hagi en
  aquesta canviarà amb el càlcul i desprès printarem el taulell amb els número nous.
  -per curar malalts en el cas que sigui globalment solament pot ser percentatges, llavors em agut de fer dos if al qual si era random em fet un math.random de l'1 al 100,
  desprès amb aquest percentatge hem de fer el càlcul de transmissió de virus per cada posició. Aquest càlcul l'hem hagut d'igual a cada posició del taulell i en cas que el      percentatge sigui específic hem hagut de fer el mateix però en comptes que el percentatge sigui random en aquest cas l'usuari a de introduirlo a la consola. i en cas que no sigui  globalment sinó posició concreta farem el mateix amb els percentatges però en comptes de fer-ho amb totes les posicions ho farem amb les que l'usuari introdueixi a la consola: això un farem fem dos variables(x,y) i aquestes dos variables les introduirem a l'arry taulell, i desprès en un if posarem que si les dos arrays
  (taulell[x][y]==taulell[i][j]), així podem saber a quina posició vol curar al malalt, desprès farem el mateix càlcul com el globalment.
  
