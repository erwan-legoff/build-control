#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: projet
#------------------------------------------------------------

CREATE TABLE projet(
        id_projet   Int  Auto_increment  NOT NULL ,
        nom_projet  Varchar (20) NOT NULL ,
        date_projet Date NOT NULL
	,CONSTRAINT projet_PK PRIMARY KEY (id_projet)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: chantier
#------------------------------------------------------------

CREATE TABLE chantier(
        id_chantier                    Int  Auto_increment  NOT NULL ,
        coordonnees_lattitude_chantier Float NOT NULL ,
        coordonnees_longitude_chantier Float NOT NULL ,
        nom_chantier                   Varchar (100) NOT NULL ,
        date_de_debut_chantier         Date NOT NULL ,
        id_projet                      Int NOT NULL
	,CONSTRAINT chantier_PK PRIMARY KEY (id_chantier)

	,CONSTRAINT chantier_projet_FK FOREIGN KEY (id_projet) REFERENCES projet(id_projet)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: sousTraitant
#------------------------------------------------------------

CREATE TABLE sousTraitant(
        id_sous_traitant           Int  Auto_increment  NOT NULL ,
        nom_sous_traitant          Varchar (500) NOT NULL ,
        corps_metier_sous_traitant Varchar (100) NOT NULL
	,CONSTRAINT sousTraitant_PK PRIMARY KEY (id_sous_traitant)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: capture
#------------------------------------------------------------

CREATE TABLE capture(
        id_capture        Int  Auto_increment  NOT NULL ,
        url_capture       Varchar (500) NOT NULL ,
        type_capture      Varchar (20) NOT NULL ,
        date_capture      Date NOT NULL ,
        longitude_capture Float NOT NULL ,
        lattitude_capture Float NOT NULL ,
        reference_gantt   Varchar (500) NOT NULL ,
        id_chantier       Int NOT NULL
	,CONSTRAINT capture_PK PRIMARY KEY (id_capture)

	,CONSTRAINT capture_chantier_FK FOREIGN KEY (id_chantier) REFERENCES chantier(id_chantier)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: equipe
#------------------------------------------------------------

CREATE TABLE equipe(
        id_equipe  Int  Auto_increment  NOT NULL ,
        nom_equipe Varchar (500) NOT NULL
	,CONSTRAINT equipe_PK PRIMARY KEY (id_equipe)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: utilisateur
#------------------------------------------------------------

CREATE TABLE utilisateur(
        id_utilisateur            Int  Auto_increment  NOT NULL ,
        identifiant_utilisateur   Varchar (100) NOT NULL ,
        nom_utilisateur           Varchar (20) NOT NULL ,
        prenom_utilisateur        Varchar (20) NOT NULL ,
        date_creation_utilisateur Date NOT NULL ,
        bloque_utilisateur        Bool NOT NULL ,
        mdp_hash_utilisateur      Varchar (500) NOT NULL ,
        id_equipe                 Int NOT NULL
	,CONSTRAINT utilisateur_PK PRIMARY KEY (id_utilisateur)

	,CONSTRAINT utilisateur_equipe_FK FOREIGN KEY (id_equipe) REFERENCES equipe(id_equipe)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: incident
#------------------------------------------------------------

CREATE TABLE incident(
        id_incident          Int  Auto_increment  NOT NULL ,
        nom_incident         Varchar (50) NOT NULL ,
        description_incident Varchar (500) NOT NULL ,
        gravite_incident     Int NOT NULL
	,CONSTRAINT incident_PK PRIMARY KEY (id_incident)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: utilisateurChantierMap
#------------------------------------------------------------

CREATE TABLE utilisateurChantierMap(
        id_utilisateur Int NOT NULL ,
        id_chantier    Int NOT NULL
	,CONSTRAINT utilisateurChantierMap_PK PRIMARY KEY (id_utilisateur,id_chantier)

	,CONSTRAINT utilisateurChantierMap_utilisateur_FK FOREIGN KEY (id_utilisateur) REFERENCES utilisateur(id_utilisateur)
	,CONSTRAINT utilisateurChantierMap_chantier0_FK FOREIGN KEY (id_chantier) REFERENCES chantier(id_chantier)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: sousTraitantChantierMap
#------------------------------------------------------------

CREATE TABLE sousTraitantChantierMap(
        id_sous_traitant Int NOT NULL ,
        id_chantier      Int NOT NULL
	,CONSTRAINT sousTraitantChantierMap_PK PRIMARY KEY (id_sous_traitant,id_chantier)

	,CONSTRAINT sousTraitantChantierMap_sousTraitant_FK FOREIGN KEY (id_sous_traitant) REFERENCES sousTraitant(id_sous_traitant)
	,CONSTRAINT sousTraitantChantierMap_chantier0_FK FOREIGN KEY (id_chantier) REFERENCES chantier(id_chantier)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: incidentCapture
#------------------------------------------------------------

CREATE TABLE incidentCapture(
        id_incident Int NOT NULL ,
        id_capture  Int NOT NULL
	,CONSTRAINT incidentCapture_PK PRIMARY KEY (id_incident,id_capture)

	,CONSTRAINT incidentCapture_incident_FK FOREIGN KEY (id_incident) REFERENCES incident(id_incident)
	,CONSTRAINT incidentCapture_capture0_FK FOREIGN KEY (id_capture) REFERENCES capture(id_capture)
)ENGINE=InnoDB;

