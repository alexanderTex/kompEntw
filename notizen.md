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
    * Unabhängig einsetzbar
    * keine Abhängigkeit zu anderen Komponenten
    ![](graphics/defi_komponente01.png)
    ![](graphics/defi_komponente02.png)


* Komponentenmodell (Definition)
![](graphics/defi_komponentenmodell.png)
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
---
## 04

* Cast ->
![](graphics/cast.png)
* Polymorphie ->
![](graphics/poly.png)
    * Konstruktoren werden nicht vererbt
    * Bei der Ausführung eines Konstruktors werden autom. die Konstruktoren der Superklasse ausgeführt.
    * Das System ruft dabei die Std.-Konstruktoren der Superklasse auf
    * Alternativen:
        * Default ergänzen wenn nicht vorhanden
        * mittels super(...) aufrufen
* ~! Typumwandlung s15
* Interfaces
    * Funktionalität für mehrere Klassen bereitstellen
    * Keine Implementierung im Interface
    * Keine Instanzerzeugung möglich
    * Enhält nur Signaturen
    * Variablen müssen Konstanten sein
    * ~! s20
    * Methoden haben immer den Sichtbarkeitesbereich public
* Abstrakte Klassen
    * Kein Instanzerzeugung
    * Enthält abstrakte Methoden (nur Signaturen) und implementierte Methoden
    * Strukturierung des Klassenbaums
* ~! Beispiel Entwurfsproblem s29 bis s37
* Entwurfsmuster Strategy s38 bis s39
* Gründe für Entwurfsmuster
    * Es ist eine Abstraktion
    * Es schont mentale Ressourcen und vereinfacht das Verständnis
    * Es vereinfacht die Kommunikation über Lösungen es Problems
    * Es ermöglicht Wiederverwendung

            "Entwurfsmuster [...] sind Beschreibungen zusammenarbeitender Objekte und Klassen, die maßgeschneidert sind, um ein [...] Entwurfsproblem in einem bestimmten Kontext zu lösen.“
---
## 05
* Entwurfsmuster Singleton +  Sync s19 - s20!
    * Nur eine Instanz eines Objektes
    * Wird genutzt im Bereich Ressourcen-Verwaltung(Caches, Treiber) und Services(Logging)
* DRY-Prinzip
    * Redundanzen vermeiden/reduzieren
    * Code Änderungen werden nur einmal durchgeführt
* Entwurfsmuster statische Fabrik-Methode
![](graphics/fac28.png)
![](graphics/fac30.png)
    * Vorteile
        * Kohäsion der Klassen => Die Funktioinalitäten sind von einander abgegrenzt(jeder erfüllt nur eine explizite Aufgabe)
        * Wenn ein neues Erzeugungsobjekt hinzukommt, muss lediglich die Fabrik angepasst werden
* Maven

    Definition:
        * Open source
        * Standards-based:Convention over Configuration
            * Stellt Default-Einstellungen zur Verfügung, die je nach Project angepasst werden können.
        * Project management framework : In Maven werden die Prozesse zum Generieren von Applikationen definiert; dies erfolgt deklarativ.
        * Simplifies:
            * Ist modular aufgebaut.
            * Für viele Anwendungen gibt es Plugins, die die eigentliche Aufgabe realisieren.

    * Einheitliche Verzeichnisstruktur
        * Wo und wie werden die Sourcen und das Compilat abgelegt?
        * Wo werden Klassen für das Testen abgelegt?
        * Wo sind Ressourcen (Text-/Konfigurationsfiles, Bilder, etc.) abgelegt?
    * Abhängigkeiten (Dependencies):
        * Welche Bibliotheken in welchen Versionen werden von den Entwicklern genutzt?
        * Wo gibt es die aktuellen Bibliotheken zum Download und welche Abhängigkeiten haben diese wiederum?
        * Wann werden die Bibliotheken genutzt? (Nur zum Testen oder müssen sie vielleicht mit ausgeliefert werden?)
    * Einheitliche Konfiguration der verwendeten Werkzeuge:
        * Welcher Compiler soll verwendet werden und wie wird er konfiguriert?
        * Wie wird die Applikation mit welchen Parametern ausgeführt?
        * Wie soll die ausgelieferte Applikation zusammengebunden werden?
        * Wie soll das Ergebnis der durchgeführten Tests aussehen?
    * Sonst
        * Welche Infrastruktur wird für das Testen und welche für den Produktivbetrieb verwendet?
        * Wie soll die Dokumentation des Projekts aussehen?
        * Welche Schritte sollen nach dem erfolgreichen werden?
        * Erzeugung von Projektinformation: Change Logs,Unit Test Reports, Dokumentation (z.B. Javadoc)

    * pom.xml
        * Enhält Projektkonfigurationen und -informationen.
        * Dient zum Bau des Projektes
    * Repsitories
    ![](graphics/mavRep.png)
    * Archetypes
        * Projekt-Templates, die die Dateistruktur und die pom.xml, auf den entsprechenden Anwendungsfall zur Verfügung stellen.
        * Bsp: mvn archetype:generate -DarchetypeArtifactId=maven-archetype-webapp
    * Lebenszyklus "Build Lifecycle"
        * Erzeugen der Projektartefakte in aufeinander folgenden Schritten(Goals)-> Zusammengehörige Goals = Plug-Ins(mvn compiler:compile)
            * Das Verhalten von Plug-Ins kann in der pom.xml konfiguriert werden.
        * Die nächst höhere Instanz sind Phasen, die die Abfolgen der Abarbeitung der Goals steuern.
        * Default Live Circle
            * validate: Prüfung, ob eine Projektstruktur gültig und vollständig ist
            * compile: Kompilierung Quellcode
            * test: Ausführung der Tests
            * install: Installation des Softwarepakets im lokalen Maven-Repository
            * deploy: Installation in entfernten Maven-Repositories
---
## 06
* Speichern und Laden von Objekten durch einen eigenen Mechanismus
    * Objekte mit den jeweiligen Abhängigkeiten werden gespeichert
        * Eigenschaften:
            * Markiert durch das Interface java.io.Serializable
            * Schreibt in einen Byte-Strom mittels java.io.ObjectOutputStream Klasse und der darin befindlichen writeObject() Methode.
            * Für die Deserialisierung wird aus der Klasse java.io.ObjectInputStream die Methode readObject() verwendet.
    * De-/Serialisierung ("Save/Load")
        * Ausnahmen werdend durch "private **transient** Image thumbnailImage;" gekennzeichnet:
            * Threads
            * Socket
            * FileInputStream
            * Speicheradressen
            * Passwörter

            Beispiel:
                    class GalleryImage implements Serializable
                    {
                        private Image image;
                        private transient Image thumbnailImage;

                        private void generateThumbnail()
                        {
                            // Generate thumbnail.
                        }

                        private void readObject(ObjectInputStream inputStream)
                                throws IOException, ClassNotFoundException
                        {
                            inputStream.defaultReadObject();
                            generateThumbnail();
                        }    
                    }
            ![](graphics/de_serial15.png)
            * Versionierung / SUID
                * Wird automatisch vergeben und beinhaltet den Hashcode aus Namen, Attributen, Parametern, Sichtbarkeit usw, die in einer UID gespeichert werden.
                * Kann manuell überschrieben werden

                        private static final long serialVersionUID= 1L;
        * Generics
            * Ziel: Dem Compiler mehr Informationen über die Typen zu geben.
            * Als Generics-Variablen können keine primitiven Datentypen verwendet werden. Nur Typvariablen (Integer nicht int)
            ![](graphics/gen27.png)
            ![](graphics/gen28.png)
            ![](graphics/gen29.png)
            * Compiliervorgang:
                * Überprüfung der Typisierung und die damit verbundenen Zuweisungen
                * Erstellung von Java-Bytecode für den Generic-Quellcode-Klasse
---
## 07

* Reflection

        In der Programmierung bedeutet Reflexion(reflection), dass ein Programm seine eigene Struktur kennt und diese, wenn nötig, modifizieren kann . Reflexion wird hier manchmal auch Introspektion genannt.

    Und warum wollen wir Reflection haben?
        * Das Reflection - Modell erlaubt es uns, Klassen und Objekte, die zur Laufzeit von der JVM im Speicher gehalten werden, zu untersuchen und in begrenztem Umfang zu modifizieren.
        * Das können wir in unterschiedlichen Situationen gebrauchen:
            * Schreiben von Hilfsprogrammen zum „Debuggen“.
            * Dynamisches Laden von Klassen in eine Anwendung und die Erzeugung von zugehörigen Exemplaren .
                * Einbinden von Klassen, die zum Compile - Zeitpunkt noch nicht bekannt sind.
                * Kode kann hinsichtlich bekannter Interfaces geschrieben, die konkreten Klassen aber später nachgeladen werden (Angaben in Konfigurationsdateien).

    *  Class-Objekt
        * Ist eine Instanz von java.lang.Class-Objekt(Meta-Objekt)
        * Beschreibt die Struktur einer Klasse/Interface und beinhalten Methoden z.B.
            * getName() : Name der Klasse
            * getFields() : Array der öffentlichen Felder
        * Ermitteln eines Class-Objektes
            * Class clazz = str.getClass();
            * Class<?> clazz = str.getClass();
            * Class clazz = String.class;
            * Class<?> clazz = String.class;
            * Class.forName(string);
        ![](graphics/reflection_14.png)
        ![](graphics/reflection_15.png)
        * Modifizierer ermitteln mittels java.lang.reflect.Modifier Klasse (public, abstract, private, interface, ...)
        * Objekt zur Laufzeit erzeugen ohne den Datentyp zur Compilezeit zu kennen.
        ![](graphics/reflection_25.png)
        ![](graphics/reflection_27.png)
        ![](graphics/reflection_28.png)
        * Methoden aufrufen
        ![](graphics/reflection_29.png)
        ![](graphics/reflection_30.png)
* Annotationen "@" - Metadaten
        * zusätzliche Semantik
        * beeinflusst die Programmsteuerung nicht
        * sind zusätzliche Modifizierer
    * Annotationtypen
    ![](graphics/reflection_36.png)

---
## 08
* Lebenszyklus
    * Request und Response-Arten
        * Faces-Request : Abfrage eines JSF-Facelets
            * Initial request
                * der View wird direkt augerufen   
            * Postback request
                * das Formular wird von der zuvor augerufenden Seite versendet
        * Non-Faces-Request : Alle anderen Anfragen (statisches HTML etc.)
        * Faces-Response : Antwort mit einem JSF-Facelets
        * Non-Faces-Response : Alle anderen Antworten (statisches HTML etc.)
    * Bearbeitungsmodell
        * Wird in Schritten(steps) druchlaufen
        * Wobei Events an interessierte Event-Listener übergeben werden
        ![](graphics/Lebenszyklus_13.png)
    * Initial request
        * Durchläuft die Phasen Restore View und Render Response
    * Postback request
        * Generell weden alle Phasen druchlaufen. Sie können jedoch durch Ereignisse/Situationen unterbrochen oder übersprungen werden.
    * Ablauf einer Anfrag
    ![](graphics/Lebenszyklus_30.png)
    ![](graphics/Lebenszyklus_31.png)
    * Den Lebenszyklus ändern "immediate-Attribut"
        * Die jeweilige Aktion wird bereits in Phase 2 - Apply Requests durchgeführt
            * Konvertierung/Validierung bei Eingabekomponenten
            * Action-Methoden und Action-Listener bei Befehlskomponenten

        wenn immediate=true ist(In einem View "Facelet").
        ![](graphics/Lebenszyklus_38.png)
    * Eventübersicht
    ![](graphics/Lebenszyklus_43.png)
    !~ ab s43 to read
---
## 09
* Konvertierung wird standardmäßig vorgenommen durch Konverter
    * standard Konverter
    * selbst implementierte Konverter
* Nach erfolgreicher Konvertierung findet, durch vorgefertigte oder selber geschriebene Validatoren, die Validierung statt.
* Contraints sind Validatoren in Bean-Validation nach JSR-303 direkt in der Bean.
    * @Max
    * @NotNull
---
## 10-11
* Dependency Injection (DI)
    * Erstellen einer Instanz außerhalb der Anwendungsklasse(Oberklasse) und Hineinreichen dieser Instanz an die Anwendungsklasse.
        * Constructor Injection
        * Interface Injection
        * Setter Injection
    * DI-Vorteile: Loose Coupling
        * Durch DI wird eine lose (loose coupling) Kopplung von Komponenten möglich gemacht
            * Eine Klasse erzeugt benötigte Instanzen (einer anderen Klasse) nicht selber, sondern lässt sich diese geben.
            * Hierbei verlangt die Klasse nur die Einhaltung bestimmter Schnittstellen und nicht Instanzen einer bestimmten Klasse.
            * Hierdurch kann z.B. das Testen einer Klasse erleichtert werden.
```java
class Gehaege(){
    Hase ha;
    // Die Instanz einer Klasse wird "hereingereicht" anstatt sie selbst zu erzeugen -> Hase ha = new Hase();
    public Gehaege(Hase hase){
        ha  = hase;
    }
}

```
* Dependency Injection Principle (DIP)
    * Einführen eines Interfaces, welches durch die Anwendungsklasse(Oberklasse) bestimmt wird
    * Erstellung einer oder mehrerer Implementierungen.
```java
class Gehaege(){
    // Interface spezifisches Object. Damit ist es moeglich Instanzen "rein zu // reichen", die das Interface Tier implementieren.
    Tier ha;
    public Gehaege(Tier tier){
        ha = tier;
    }
}
```
* Dependency Injection Container (DIC)
    * Ist das Konzept, welches die Abhängigkeiten automatisch erzeugt und bereitstellt.
* Contexts and Dependency Injection
    * Die Umsetzung des Konzept DIC in Java. Erzeugen/Bereitstellen von Instanzen und ihren kompletten Abhängigkeiten.
    * Hauptaufgabe von CDI: Verwaltung von Beans mit definiertem Lebenszyklus
    * Mechanismus: Beans können definiert und über typsichere DI miteinander verknüpft werden
* Single-Responsibility-Prinzip (SRP)

        Nach Robert C. Martin: In der objektorientierten Programmierung sagt das SRP aus, dass jede Klasse nur eine fest definierte Aufgabe zu erfüllen hat. In einer Klasse sollten lediglich Funktionen vorhanden sein, die direkt zur Erfüllung dieser Aufgabe beitragen . DI erlaubt es dem SRP zu folgen.

---
## 12-13
* JPA
    * Impedance Mismatch
        * Sind Konflikte, die aus den Strukturunterschieden zwischen den Systemen entstehen hier:
            * Objektorientierte Programmiersprache
                * Vererbung
                * Objektidentität
                * Komplexe Beziehung
            * Relationalen Datenbank
                * Primärschlüssel
                * Fremdschlüssel
                * Fremdschlüsselspalten dürfen nicht mehrwertig sein
    * Lösung: O/R-Mapping(Objekt-relationales Mapping)
        * Es soll möglicht automatisiert und transparent("nicht sichtbar", "nicht merklich") sein.
    ![](graphics/jpa_18.png)
    ![](graphics/jpa_21.png)
    * Um die Klasse als persistentes Objekt zu kennzeichnen benötigt man die Annotationen:
        * @Entity oberhalb der Klasse und
        * @Id oberhalb eines Attributes, welches als Primärschlüssel verwendet werden soll.
        ![](graphics/jpa_23.png)
