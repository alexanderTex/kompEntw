# Komponentenbasierte Entw.

## 01
* Java Platform, Enterprise Edition (JEE)
    * Spezifikation einer Sofwarearchitektur für transaktionsbasierte Ausführungen in Java


* Framework

        Ein Rahmenwerk (framework) ist ein durch den Software-Entwickler [...] erweiterbares System kooperierender Klassen , die einen wiederverwendbaren Entwurf für einen bestimmten Anwendungsbereich implementieren. [...] Im Allgemeinen wird vom Anwender des Rahmenwerkes erwartet, dass er Unterklassen definiert, um das Rahmenwerk zu verwenden [...]. Diese [...] Unterklassen empfangen Botschaften von [...] den Rahmenwerkklassen nach dem Hollywood - Prinzip „ Don‘t call us, we‘ll call you “.

    * Zentrale Aspekte:
        * Ist ein wiederverwendbarer Entwurf
        * Hat eine Implementierung
        * Ist für ein bestimmtes Anwendungsgebiet
        * Wird von Entwicklern erweitert
        * Don't call us, we call you!
            * Das Framework ruft useren Kode auf wobei Bibiliothken Funktionen bereitstellen, die der Entwickler verwendet/aufruft.
        * Wiederverwendbarkeit
        * Sind keine vollständigen Programme, sie müssen erweitert werden.

    * Frage - Antworten
        * Frameworks stellen Programmkode zur Verfügung, der bei seinem Einsatz
verändert werden muss. Es stellt zusätzliche Funktionalitäten zur Verfügung, die vom Entwickler angepasst werden können.
        * Frameworks setzen Entwurfsmuster um.
        * Frameworks können einen hohen Einarbeitungsaufwand voraussetzen.

* JavaServer Faces (JSF)
![Webapplikation mit Java](graphics/webapp_mit_java.png)

* MVC - Model View Controller
Unterteilung der Applikation in drei miteinander verbundene Teile:
    * Model:
        * Datenmodell:
            * enhält die Daten
            * von Steuerung und Präsentation unabhängig
            * vom Controller befragt und modifiziert
    * View
        * Präsentation:
            * Befragt das Modell, um seine Darstellung anzupassen
    * Controller
        * Programmsteuerung:
            * Verarbeitung der Eingaben
            * Kommunikation dieser an das Modell

 * Model 2 - MVC für Java-Webanwendungen
 ![Model2](graphics/model2.png)
     * JavaBeans
         1. Default constructor
         2. Serialisierbar
         3. Public Getter/Setter

* Java-Annotations
    * Metadaten im Quelltext, z.B. Klassen (mit @) <br>
        @Deprecated <br>
        public class A{}
    * werden z.B. vom Compiler ausgewertet um Warnungen zu erzeugen

* Session
    * Bezeichnet eine stehende Verbindung vom Client zu einem Server
    * Beim zustandslosen HTTP kann so etwas nur „emuliert“ werden.

* Entwicklung einer JSF-Applikation
    * Modell entwickeln - JavaBean-Entwickeln
    * Mitgelieferten Controller einsatzfähig machen - Konfiguration
    * View für die Anzeige entwickeln (Facelet-Technologie)
        * XHTML
    ![](graphics/entwJSFapp.png)
* JavaServerFaces 2.2: Der Controller
    * JSF liefert zwei Konfigurationsdateien um den vorhandenen Controller zu konfigurieren
        * web.xml <br>
        Welche Anfragen vom Controller bearbeitet/reagiert werden soll.
        * faces-config.xml<br>
            Legt die Navigation fest.

* Unified Expression Language (EL 2.1)
    * ~! eine JavaScript-ähnlich Programmiersprache
    * kann in Facelets (XHTML) verwendet werden
    * Syntax #{....} -> #{customer.lastName}
    * Verbindet View mit Model -> mit EL auf Managed-Beans zugreifen

* Der View
    * Sind definiert in Facelets
    * Beinhalten Tags der Facelet-HTML-Tag-Bibliothek
    * Gehören zum JSF-Framework
* ~! Praktischer Ablauf ab s30 bis s35

---
## 02

* Frage - Antwort
    * Sw-Produkte schneller am Markt zu positionieren
    * Geld bei der Sw-Entwicklung zu sparen
    * Die Qualität von Software zu verbessern.
* Faktoren des Erfolges resultierend aus der Definition von Komponentenbasierter Entwicklung
    * Time-to-Market
        * Idee : Die Wiederverwendung einer Komponente benötigt weniger Zeit als ihre Entwicklung.
            * Systeme können schneller entwickelt werden.
    * Arbeits-Produktivität
        * Idee : Wiederverwendung ex. Lösungen statt „Neuerfindung“:
            * Es kann mehr Software pro Person entwickelt werden.
            * Entwicklungskosten werden reduziert.
            * Wettbewerbsfähigkeit wird erhöht.
    * Wartung
        * Idee: Komponentenbasierte Entwicklung setzt einen „guten“ modularen Entwurf (modular design) voraus.
            * Verständlich (comprehensible)
            * Wartbar (maintainable)
            * Flexibel (flexible)
    * Qualität
        * Idee: Zusammensetzen eines Systems aus einer Sammlung qualitativ hochwertiger Komponenten führt zu einem qualitativ hochwertigen System.
            * Die Kosten für das Erreichen der hohen Qualität der Komponenten amortisiert sich durch den wiederholten Einsatz.
            * Der wiederholte Einsatz von Komponenten verbessert ihre Qualität.
            * Wahrscheinlichkeit Fehler zu finden/beseitigen zu müssen sinkt.
* Komponenten (Definition)
    * Teil eines Systems
    * Besitzt spezifizierte Schnittstellen
    * Unabhängig einsätzbar
    * keine Abhängigkeit zu anderen Komponenten
    ### Grafik s20 s21

* Komponentenmodell (Definition)
    ### Grafik s24
* Elemente eines Komponentenmodells
    * Interfaces von Komponenten
    * Informationen die benötigt werden, Komponenten zu nutzen
    * Verteilung/Installation von Komponenten
    * Zusammenfassung Kerneigenschaften:
        * Spezifiziert Form und Eigenschaften von Komponenten.
        * Legt fest wie Komponenten miteinander sprechen und verbunden werden können.
        * Legt fest, wie die Infrastruktur der Komponenten aussieht.
        * Achtung: Zu einem Komponentenmodell können mehrere Implementierungen existieren.
* Tags und Komponenten
    * Die Tags der XHTML-Seite werden beim Aufruf auf dem Server
        1. in (Instanzen von) Komponenten umgesetzt und
        2. in einem Komponentenbaum angeordnet.
