/*9. A Planet Explorer routinely travels across the planets in the Solar System to discover life form, minerals available, etc. However, the method of exploring is different on each planet, due to the difference in atmosphere and surface composition. Every explorer should have an explore method that is defined based on the type of the explorer and the planet where (s)he is exploring. Consider three planets-Mars, Venus, and Saturn. Implement it using interfaces, abstract class, inheritance.  */
// Name: Prosenjit Hawlader
// Roll No: 002410501066
// Planet Interface
interface Planet {
    String getPlanetName();
}


// Concrete Planet Classes
class Mars implements Planet {
    public String getPlanetName() {
        return "Mars";
    }
}

class Venus implements Planet {
    public String getPlanetName() {
        return "Venus";
    }
}

class Saturn implements Planet {
    public String getPlanetName() {
        return "Saturn";
    }
}


// Abstract Explorer Class
abstract class PlanetExplorer {

    protected Planet planet;

    public PlanetExplorer(Planet planet) {
        this.planet = planet;
    }

    // Abstract method (must be implemented differently)
     abstract public void explore();
}


// Mars Explorer
class MarsExplorer extends PlanetExplorer {

    public MarsExplorer(Planet planet) {
        super(planet);
    }

    @Override
    public void explore() {
        System.out.println("Exploring " + planet.getPlanetName() +
                " using rovers to search for water and minerals.");
    }
}


// Venus Explorer
class VenusExplorer extends PlanetExplorer {

    public VenusExplorer(Planet planet) {
        super(planet);
    }

    @Override
    public void explore() {
        System.out.println("Exploring " + planet.getPlanetName() +
                " using heat-resistant probes due to high temperature.");
    }
}


// Saturn Explorer
class SaturnExplorer extends PlanetExplorer {

    public SaturnExplorer(Planet planet) {
        super(planet);
    }

    @Override
    public void explore() {
        System.out.println("Exploring " + planet.getPlanetName() +
                " using atmospheric balloons to study gas composition.");
    }
}


// Main Class
public class SolarSystemTest {

    public static void main(String[] args) {

        Planet mars = new Mars();
        Planet venus = new Venus();
        Planet saturn = new Saturn();

        PlanetExplorer marsExp = new MarsExplorer(mars);
        PlanetExplorer venusExp = new VenusExplorer(venus);
        PlanetExplorer saturnExp = new SaturnExplorer(saturn);

        marsExp.explore();
        venusExp.explore();
        saturnExp.explore();
    }
}

