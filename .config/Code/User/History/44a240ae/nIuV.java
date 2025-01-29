public class Musician 
{
    private String instrument;    
    private Band band;
    MusicianInfo musicianInfo = new MusicianInfo();

    public Musician(String instrument, Band band) {
        this.instrument = instrument;
        this.band = band;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }

    public void printFestival()
    {
        class Festival
        {
            String name;
            int year;

            public Festival(String name, int year) {
            this.name = name;
            this.year = year;
            }

            public String getName() {
            return name;
            }

            public void setName(String name) {
            this.name = name;
            }

            public int getYear() {
            return year;
            }

            public void setYear(int year) {
            this.year = year;
            }
        }

        Festival rockFestival = new Festival("Rock Fest", 1995);

        System.out.println(band.getName() + " preformed at " + rockFestival.getName() + " in " + rockFestival.getYear());
    }


    public class MusicianInfo
    {
        boolean available;

        public void setAvailable(boolean available) 
        {
            this.available = available;
        }

        public void printInfo()
        {
            System.out.println(instrument);
            System.out.println(band.getStyle());
            System.out.println(available? "available" : "Not available");
        }
    }

    public static class Band
    {
        public string name;
        private int members;
        private String style;

        public Band(int members, String style) {
            this.members = members;
            this.style = style;
        }

        public int getMembers() {
            return members;
        }

        public void setMembers(int members) {
            this.members = members;
        }

        public String getStyle() {
            return style;
        }

        public void setStyle(String style) {
            this.style = style;
        }
    }
}
