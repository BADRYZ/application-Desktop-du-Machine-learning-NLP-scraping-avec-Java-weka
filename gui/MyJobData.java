package view;

public class MyJobData {
    private String title;
    private String typeContrat;
    private String experience;
    private String ville;
    private String requirements;
    private int nbPoste;
    private String link;
    private String date;
    private String site;
    private String domaine;
    private String country;

    public MyJobData(String title, String typeContrat, String experience, String ville, String requirements,
                     int nbPoste, String link, String date, String site, String domaine, String country) {
        this.title = title;
        this.typeContrat = typeContrat;
        this.experience = experience;
        this.ville = ville;
        this.requirements = requirements;
        this.nbPoste = nbPoste;
        this.link = link;
        this.date = date;
        this.site = site;
        this.domaine = domaine;
        this.country = country;
    }

    // Getter methods if needed
    public String getTitle() {
        return title;
    }

    public String getTypeContrat() {
        return typeContrat;
    }

    public String getExperience() {
        return experience;
    }

    public String getVille() {
        return ville;
    }

    public String getRequirements() {
        return requirements;
    }

    public int getNbPoste() {
        return nbPoste;
    }

    public String getLink() {
        return link;
    }

    public String getDate() {
        return date;
    }

    public String getSite() {
        return site;
    }

    public String getDomaine() {
        return domaine;
    }

    public String getCountry() {
        return country;
    }
}
