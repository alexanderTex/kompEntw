Komponentenbasierte Entwicklung: Mitschriften
==============================================

<h3 id="content">Content</h3>

*   [JavaServer Faces in a Nutshell](#JSFnutshell)
    * [Webframeworks](#webframeworks)
    * [Java Servlets](#servlets)
    * [Java Beans](#javabeans)
    * [MVC - Model2](#model2)
    * [Entwicklung einer JSF-Application](#jsfApp)
    * [Framework](#framework)
*   [Komponenten & Komponentenmodelle](#komponenten)
    * [Komponentenbasierte Entwicklung](#kompEntw)
    * [Herausforderungen der Entwicklung](#herausforderungen)
    * [Erfolgsfaktoren](#erfolgsfaktoren)
    * [Software-Komponenten](#softKomp)
    * [Schnittstellen (Interfaces)](#interfaces)
    * [Softwareverteilung (software deployment)](#softwareverteilung)
    * [Komponentenmodell](#Komponentenmodell)

***
<!--

    JavaServer Faces in a Nutshell

-->

<h2 id="JSFnutshell">JavaServer Faces in a Nutshell</h2>

<h3 id="webframeworks">Webframeworks</h3>

*   große Teile der Layout-Beschreibung werden mittels einer
    Seitendeklarationssprache erstellt
    *   Seitendeklarationssprache (View Declaration Language) ist
        eine Syntax um Anschichten bzw. Seiten für JSF zu deklarieren.
*   möglichtst wenig Funktionalität im Sinne von Anwendungslogik zwischen
    die Elemente der VDL einzufügen.

<h3 id="servlets">Java Servlets</h3>

*   dynamische Inhalte mit Java erzeugen
*   Java-Klassen, die eine Schnittstelle implementieren und ihre Ausgaben(Erzeugnisse)
    an einen Stream weiitergeben.
*   Ihre Instanzen nehmen innerhalb des Webservers Anfragen vom Client entgegen
    und beantworten diese.

<h3 id="javabeans">Java Beans</h3>

*   Es sind in Java programmierte software-Komponenten, die speziell für
    Wiederverwendbarkeit entworfen wurden und zum Aufbau von Applikationen dienen.
*   Eigenschaften:
    *   Wird im Programm durch ein Objekt repräsentiert, welches durch die Anwendung
        initialisiert und deklariert wird, wobei hier dringend der parameterlose
        Konstruktor(Default Constructor) benötigt wird.
    *   JB besitzt konfigurierbare Eigenschaften, welche über Methodenaufrufe
        modifiziert werden.
        *   Get-Methoden
        *   Set-Methoden
    *   JB sind serialisierbar(serializable). Dies stellt ein Mechanismus dar,
        der die Objektstruktur und Variablenumgebung zu einer bestimmten Zeit
        sichert(Persistenz) und an anderer Stelle wieder hervorholt um sie
        wieder herzustellen.

<h3 id="model2">MVC - Model2</h3>

Das Model2-Pattern dient als Grundlage für Webframeworks zur Webentwicklung mit Java.
*   Eine klare Trennung zwischen den Bereichen
    *   Steuerlogik(Controler) => Java Servlets
    *   Modell(Model)
        => Java Beans oder POJOs(Plain Old Java Objects - ganz normale Objekte in Java)
    *   Ansicht(View) => Facelets(XHTML - Seitendeklarationssprache)

![Model2](http://jsfatwork.irian.at/grafiken/mvc-model2.jpg)

<h3 id="jsfApp">Entwicklung einer JSF-Application</h3>

1.  Modells entwickeln
    *   Java Beans
2.  Controler konfigurieren
    *   web.xml : Definiert Einsatzzeitpunkt (Wann)
    *   faces-config.xml : Definiert das Vorgehen (Wie) z.B. Navigation
3.  Views entwickeln
    *   Die Programmiersprache Unified Expression Language (EL 2.0) kann zusätzlich
        in Facelet verwendet werden. Dadurch verbindet sie den View mit dem Model.

<h3 id="framework">Framework</h3>

Ein FW ist ein erweiterbares System kooperativer Klassen, die einen wiederverwendbaren
Entwurf für einen bestimmten Anwendungsbereich implementiert [...] Es wird erwartet,
dass der Entwickler Unterklassen definiert, um das FW zu verwenden. Diese Unterklassen werden von den FW-Klassen nach dem Hollywood-Prinzip "Don't call us, we'll call you" aufgerufen.
*   wiederverwendbarer Entwurf (Entwurfsmuster - Design Pattern)
*   System kooperativer Klassen implementiert
*   bestimmter Anwendungsbereich z.B. Webapplikation
*   wird von Entwickler erweitert z.B. Facelet, Manage-Beans
*   Hollywood-Prinzip : Das FW ruft Entwicklercode auf.
*   Ziel eines FW ist die Wiederverwendung (reuse)
*   FW sind keine vollständigen Programme

***

<!--

    Komponenten & Komponentenmodelle
-->

<h2 id="komponenten">Komponenten & Komponentenmodelle</h2>

<h3 id='kompEntw'>Komponentenbasierte Entwicklung</h3>

Definition(en):
*   Schnelle Montage (rapid assembly)
*   Vorhersagbarkeit (predictability) = Durch die Eigenschafte der einzelnen Komponenten lassen sich Rückschlüsse über die Eigenschaften des Gesamtsystems ziehen.
*   Signifikante(typische) Anzahl von Komponenten
*   Explizite Wiederverwendbarkeit der Komponenten

*   Keine Aussage über die Eigenschaften der Komponenten und ihre Auswirkungen auf das Gesamtsystem.

<h3 id='herausforderungen'>Herausforderungen der Entwicklung</h3>

*   Größe und Komplexität z.B. Erweiterung der Produktfamilie
*   Aktualisierung
*   Time-to-Market (Präsenz am Markt)
*   Entwicklungskosten

<h2 id='erfolgsfaktoren'>Erfolgsfaktoren</h3>

*   Time-to-Market
    *   Dauer von der Produktentwicklung bis zur Platzierung des Produkts am Markt.
    *   Realisierung: Die Wiederverwendung von Komponenten benötigt weniger Zeit, als ihre Entwicklung = System kann schneller entwickelt werden.
*   Produktivität
    *   Verhältnis von Produktionsergebnis (Output) und an seiner Erstellung beteiligten Inputs.
    *   Realisierung: Wiederverwendung externer Lösungen statt Neuentwicklung. =
        *   mehr Sw pro Person entwickelt werden
        *   Reduzierung der Entwicklungskosten
        *   Erhöhung der Wettbewerbsfähigkeit
*   Wartung
    *   Verzögerung des Abnutzungsvorganges z.B. Fehlerbehebung, Erweiterung
*   Qualität
    *   Realisierung: Grundlage ist ein "guter" modularer Entwurf (modular design)
        *   Verständlich (comprehensible)
        *   Wartbar (maintainable)
        *   Flexibel (flexible)
    *   Der Grad, in dem ein Satz inhärenter(enthaltener) Merkmale Anforderungen erfüllt.
    *   Realisierung: Systemzusammensetzung aus einer Sammlung qualitativ hochwertiger Komponenten. = Der wiederholte Einsatz der Komponenten führt zu einer Verbesserung der Qualität, die diese angepasst und kontinuierlich getestet werden.

<h2 id='softKomp'>Software-Komponenten</h3>

*   Verwendung von Komponenten
    *   ... die unabhängig voneinander erworben, installiert und gewartet werden können.
    *   ... die ausgetauscht, wiederverwendet und erneut zusammengesetzt werden könne (composition).
*   Intrinsische Eigenscaften von Komponenten. Sie bieten kohäsive(zusammenhängende) Dienste (cohesive services), die ...
    *   Designentscheidungen kapseln
    *   explizite Abhängigkeiten
    *   darstellen einer Abstraktion
    *   anwendungsunabhängig
    *   konfigurierbar
*   Systemeigenschaften
    *   werden lose miteinander gekoppelt
    *   standardisierte Interfaces
    *   self-contained (complete by itself)

<h3 id'interfaces'>Schnittstellen (Interfaces)</h3>

Ist Teil des Systems, welcher der Kommunikation dient.<br>
CBSE (Component Based Software Engineering) definiert zwei Arten von Interfaces für Komponenten:
*   provides interfaces(component API) - Bereitstellung
    *   Methoden zum Hinzufügen, Löschen von Sensoren.
*   requires interfaces - Anforderungen
    *   Verwaltungsmöglichkeit des Moduls
    *   Dem Modul werden Daten bereitgestellt

<h3 id='softwareverteilung'>Softwareverteilung (software deployment)</h3>

Prozesse zur Installation von Software auf das Zielsystem.<br>
Komponenten sind indipendently deployable:

*   Werden als eine Einheit installiert
*   keine direkte Abhägigkeit zu anderen Komponenten
*   sind für sich einfach installierbar

<h3 id='komponentenmodell'>Komponentenmodell</h3>

*   Komponenten können nur im Rahmen eines bestimmten Kontextes, dem Komponentenmodell, verwendet werden.
*   Es legt ...
    *   den Rahmen z.B. Lebenszyklus von Komponenten,
    *   die strukturellen Anforderungen z.B. Komposition,
    *   die verhaltensorientierten Kollaborationsmöglichkeiten z.B. Kommunikation und
    *   die Infrastruktur z.B. Services
    fest.
*   Kerneigenschafte:
    *   Spezifiziert Form und Eigenschaften von Komponenten.
    *   Definiert wie die Komponenten mit einander kommunizieren und verbunden sind.
    *   Definiert die Infrastruktur der Komponenten.
    *   Es können mehrere Implementierungen existieren.
