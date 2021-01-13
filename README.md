# projecte M3
-Esquema principal del projecte:
  1. Primer l'usuari ha de crear un taulell buit(tindrem una array delimitada per columnes i files, i un for per les columnes que tindra un altre dins per les filas i printarem per cada posicio un 0) o crear un taulell que ja tingui malalts(tindrem una array delimitada per columnes i files, i un for per les columnes que tindra un altre dins per les filas i printarem per cada posicio un numero random del 0 al 9, Math.random) .
  
  2. Al usuari se li proporcionara un menu on pot triar la opció que vulgui, on li demanarem un numero i segons aquest numero escollira una opció o una altre, cada opcio estara enmagatzemada en un while.
  
  3. Si posa el numero 2, agafa la opció de introduir malalts on, primer li pregunten que a quina posició del taulell vol afegir malalts(aquestes posicions seran dues variables(taulell[y][x])) y despres el numero de malalts vol que hi hagi en aquesta posició opcionalment l'usuari pot afegir malalts a la posició que vulgui del taulell.
  
  4. Si posa el numero 3, agafa la opció de transmitir  virus, primer li demanara quina tasa vol(variable de tipus float) que no sigui inferior a 0, posarem dos for per recorrer columnes i files i dins farem el calcul de la tasa.
  
  5. Si posa el numero 4, agafara la opció de curar malalts, li preguntara que si vol aplicar la cura glogalment o a una posició concreta, si posa globalment, li preguntara que si vol que el precenntage de curats vol que sigui random(Math.random) o especific, si en comptes de globalment posa concreta, li preguntara si vol un percentage o valor concret, si posa peercentage sera com abans pero a la posició del taulell que el usuari desitji(taulell[y][x]), i si posa valor concret se li demanara al usuari un valor de curats respecte a la posició abans demanada, el valor sempre ha de ser mes petit que el numero de malalts de la posició concreta.
  
  6. Si posa el numero 5, agafara la opció de desplaçar malalts, on primer li pregunten quina posició(y,x) de la taula vol escollir per desplaçar els malalts, a continuacio amb una varible int, demanarem cuants malalts de la posició vol desplaçar, sempre menor que els malalts que hi han a la posició, per ultim li demana que posi una de les següents lletres:q (dalt esquerra), w (dalt mig), e (dalt dreta), a (esquerra mig), d (dreta mig), z (baix esquerra), x (baix mig), c (baix dreta), segons la lletra que posi la a la 
  x = files , y = columnes, li restarem o sumaren la posició, en cas de la y si es dalt = y-1 i si es baix = y+1 i si es esquerra o dreta es queda igual i a la inversa amb la x,
  si es esquerra = x-1 i si es dreta= x+1, si es dalt o baix es queda igual, tota aixo en un if de que si la lletra que introdueixes es igual a alguna de les que hi hagi en el lletra.equals(), la posició cambiara respecte la lletra
  7.
  8.
  9.
  
-Explicació de decisions de disseny:

  -Primer de tot hem hagut de crear dos variables que es diuen files i columnes, per desprès utilitzar-les en un for per poder anar posició per posició del taulell.
  -Desprès hem hagut de crear un array per poder emmagatzemar les posicions del taulell que va regit per files i columnes.
  -Per cada punt del projecte em agut de printar si volia fer-ho, desprès hem hagut de crear les corresponents variables per a la resposta de l'usuari.
  -Per introduir malalts hem hagut de crear dos for, un per les files i l'altre per les columnes i a cada posició igualar l'array taulell al número de persones que vol l'usuari
    i després printar el taulell.
  -Per fe el punt de transmetre virus hem hagut de fer el càlcul i igualar les posicions del taulell a aquest càlcul, i així per cada posició del taulell el número que hi hagi      en aquesta canviarà amb el càlcul i desprès printarem el taulell amb els número nous.
  -Per curar malalts en el cas que sigui globalment solament pot ser percentatges, llavors hem hagut de fer dos if al qual si era random em fet un math.random de l'1 al 100,
    desprès amb aquest percentatge hem de fer el càlcul de transmissió de virus per cada posició. Aquest càlcul l'hem hagut d'igual a cada posició del taulell i en cas que el       percentatge sigui específic hem hagut de fer el mateix però en comptes que el percentatge sigui random en aquest cas l'usuari a de introduirlo a la consola. i en cas que no     sigui  globalment sinó posició concreta farem el mateix amb els percentatges però en comptes de fer-ho amb totes les posicions ho farem amb les que l'usuari introdueixi a la     consola: això un farem fem dos variables(x,y) i aquestes dos variables les introduirem a l'arry taulell, i desprès en un if posarem que si les dos arrays
    (taulell[x][y]==taulell[i][j]), així podem saber a quina posició vol curar al malalt, desprès farem el mateix càlcul com el globalment.
  
