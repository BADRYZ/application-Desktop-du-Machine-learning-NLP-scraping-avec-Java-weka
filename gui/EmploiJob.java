package model;

public class EmploiJob {
    private String titre; // Correspond à la colonne "titre" dans la table
    private String url;
    private String sitename;
    private String datedepublication;
    private String datedepostule;
    private String adressdelentreprise;
    private String sitewebdentreprise;
    private String descriptiondelentreprise;
    private String descriptiondeposte;
    private String region;
    private String ville;
    private String secteurdactivite;
    private String metier;
    private String typedecontrat;
    private String niveaudetude;
    private String diplome;
    private String experience;
    private String profilerecherche;
    private String traitsdepersonnalite;
    private String hardskills;
    private String softskills;
    private String competencerecommandees;
    private String langue;
    private String niveaudelalangue;
    private String salaire;
    private String avantagesociaux;
    private String teletravail;
    private String nomdentreprise;

    public EmploiJob() {
    }

    public EmploiJob(String titre, String url, String sitename, String datedepublication, String datedepostule,
                     String adressdelentreprise, String sitewebdentreprise, String descriptiondelentreprise,
                     String descriptiondeposte, String region, String ville, String secteurdactivite, String metier,
                     String typedecontrat, String niveaudetude, String diplome, String experience,
                     String profilerecherche, String traitsdepersonnalite, String hardskills, String softskills,
                     String competencerecommandees, String langue, String niveaudelalangue, String salaire,
                     String avantagesociaux, String teletravail, String nomdentreprise) {
        this.titre = titre;
        this.url = url;
        this.sitename = sitename;
        this.datedepublication = datedepublication;
        this.datedepostule = datedepostule;
        this.adressdelentreprise = adressdelentreprise;
        this.sitewebdentreprise = sitewebdentreprise;
        this.descriptiondelentreprise = descriptiondelentreprise;
        this.descriptiondeposte = descriptiondeposte;
        this.region = region;
        this.ville = ville;
        this.secteurdactivite = secteurdactivite;
        this.metier = metier;
        this.typedecontrat = typedecontrat;
        this.niveaudetude = niveaudetude;
        this.diplome = diplome;
        this.experience = experience;
        this.profilerecherche = profilerecherche;
        this.traitsdepersonnalite = traitsdepersonnalite;
        this.hardskills = hardskills;
        this.softskills = softskills;
        this.competencerecommandees = competencerecommandees;
        this.langue = langue;
        this.niveaudelalangue = niveaudelalangue;
        this.salaire = salaire;
        this.avantagesociaux = avantagesociaux;
        this.teletravail = teletravail;
        this.nomdentreprise = nomdentreprise;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public String getDatedepublication() {
        return datedepublication;
    }

    public void setDatedepublication(String datedepublication) {
        this.datedepublication = datedepublication;
    }

    public String getDatedepostule() {
        return datedepostule;
    }

    public void setDatedepostule(String datedepostule) {
        this.datedepostule = datedepostule;
    }

    public String getAdressdelentreprise() {
        return adressdelentreprise;
    }

    public void setAdressdelentreprise(String adressdelentreprise) {
        this.adressdelentreprise = adressdelentreprise;
    }

    public String getSitewebdentreprise() {
        return sitewebdentreprise;
    }

    public void setSitewebdentreprise(String sitewebdentreprise) {
        this.sitewebdentreprise = sitewebdentreprise;
    }

    public String getDescriptiondelentreprise() {
        return descriptiondelentreprise;
    }

    public void setDescriptiondelentreprise(String descriptiondelentreprise) {
        this.descriptiondelentreprise = descriptiondelentreprise;
    }

    public String getDescriptiondeposte() {
        return descriptiondeposte;
    }

    public void setDescriptiondeposte(String descriptiondeposte) {
        this.descriptiondeposte = descriptiondeposte;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getSecteurdactivite() {
        return secteurdactivite;
    }

    public void setSecteurdactivite(String secteurdactivite) {
        this.secteurdactivite = secteurdactivite;
    }

    public String getMetier() {
        return metier;
    }

    public void setMetier(String metier) {
        this.metier = metier;
    }

    public String getTypedecontrat() {
        return typedecontrat;
    }

    public void setTypedecontrat(String typedecontrat) {
        this.typedecontrat = typedecontrat;
    }

    public String getNiveaudetude() {
        return niveaudetude;
    }

    public void setNiveaudetude(String niveaudetude) {
        this.niveaudetude = niveaudetude;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getProfilerecherche() {
        return profilerecherche;
    }

    public void setProfilerecherche(String profilerecherche) {
        this.profilerecherche = profilerecherche;
    }

    public String getTraitsdepersonnalite() {
        return traitsdepersonnalite;
    }

    public void setTraitsdepersonnalite(String traitsdepersonnalite) {
        this.traitsdepersonnalite = traitsdepersonnalite;
    }

    public String getHardskills() {
        return hardskills;
    }

    public void setHardskills(String hardskills) {
        this.hardskills = hardskills;
    }

    public String getSoftskills() {
        return softskills;
    }

    public void setSoftskills(String softskills) {
        this.softskills = softskills;
    }

    public String getCompetencerecommandees() {
        return competencerecommandees;
    }

    public void setCompetencerecommandees(String competencerecommandees) {
        this.competencerecommandees = competencerecommandees;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public String getNiveaudelalangue() {
        return niveaudelalangue;
    }

    public void setNiveaudelalangue(String niveaudelalangue) {
        this.niveaudelalangue = niveaudelalangue;
    }

    public String getSalaire() {
        return salaire;
    }

    public void setSalaire(String salaire) {
        this.salaire = salaire;
    }

    public String getAvantagesociaux() {
        return avantagesociaux;
    }

    public void setAvantagesociaux(String avantagesociaux) {
        this.avantagesociaux = avantagesociaux;
    }

    public String getTeletravail() {
        return teletravail;
    }

    public void setTeletravail(String teletravail) {
        this.teletravail = teletravail;
    }

    public String getNomdentreprise() {
        return nomdentreprise;
    }

    public void setNomdentreprise(String nomdentreprise) {
        this.nomdentreprise = nomdentreprise;
    }

    @Override
    public String toString() {
        return "EmploiJob{" +
                "titre='" + titre + '\'' +
                ", url='" + url + '\'' +
                ", sitename='" + sitename + '\'' +
                ", datedepublication='" + datedepublication + '\'' +
                ", datedepostule='" + datedepostule + '\'' +
                ", adressdelentreprise='" + adressdelentreprise + '\'' +
                ", sitewebdentreprise='" + sitewebdentreprise + '\'' +
                ", descriptiondelentreprise='" + descriptiondelentreprise + '\'' +
                ", descriptiondeposte='" + descriptiondeposte + '\'' +
                ", region='" + region + '\'' +
                ", ville='" + ville + '\'' +
                ", secteurdactivite='" + secteurdactivite + '\'' +
                ", metier='" + metier + '\'' +
                ", typedecontrat='" + typedecontrat + '\'' +
                ", niveaudetude='" + niveaudetude + '\'' +
                ", diplome='" + diplome + '\'' +
                ", experience='" + experience + '\'' +
                ", profilerecherche='" + profilerecherche + '\'' +
                ", traitsdepersonnalite='" + traitsdepersonnalite + '\'' +
                ", hardskills='" + hardskills + '\'' +
                ", softskills='" + softskills + '\'' +
                ", competencerecommandees='" + competencerecommandees + '\'' +
                ", langue='" + langue + '\'' +
                ", niveaudelalangue='" + niveaudelalangue + '\'' +
                ", salaire='" + salaire + '\'' +
                ", avantagesociaux='" + avantagesociaux + '\'' +
                ", teletravail='" + teletravail + '\'' +
                ", nomdentreprise='" + nomdentreprise + '\'' +
                '}';
    }

    // Getters et Setters (vous pouvez générer automatiquement ces méthodes dans votre IDE)


    public void affiche() {
        System.out.println(this.toString());
    }
}
