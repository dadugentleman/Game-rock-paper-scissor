Rock Paper Scissors (Java Swing)

Un joc clasic Piatră-Hârtie-Foarfecă, implementat în Java Swing, unde jucătorul se confruntă cu calculatorul.
Proiect simplu, educațional, pentru învățarea OOP în Java și dezvoltarea de aplicații desktop.

Caracteristici

Interfață grafică intuitivă cu Java Swing

Butoane pentru alegerea între Rock / Paper / Scissors

Mutări generate aleatoriu pentru computer

Scor live afișat pentru jucător și computer

Fereastră popup pentru rezultat + opțiune Try Again

Structura proiectului

src/
│── App.java                 # Punctul de intrare - lansează GUI-ul
│── RockPaperScissorGUI.java # Frontend - gestionează interfața grafică și interacțiunile
│── RockPaperScissor.java    # Backend - logica jocului și scorurile


Cerințe

Java JDK 8+ instalat

IDE Java (ex: IntelliJ, Eclipse, NetBeans) sau linia de comandă

Cum rulezi aplicația

Clonează repo-ul:

git clone https://github.com/dadugentleman/Game-rock-paper-scissor.git
cd Game-rock-paper-scissor/src


Compilează clasele:

javac App.java RockPaperScissorGUI.java RockPaperScissor.java


Rulează aplicația:

java App

Reguli de joc

✊ Rock bate ✌️ Scissors

✌️ Scissors bate 📄 Paper

📄 Paper bate ✊ Rock

Alegere identică = egalitate
