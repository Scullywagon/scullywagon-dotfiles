public class Musician 
{
    private String instrument;    
    private Band band;

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
            System.out.println(available);
        }
    }

    public static class Band
    {
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
