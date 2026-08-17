# Gestion des cultures

Projet de gestion d'un parc de cultures agricoles.

## Description

Ce projet permet de gérer différentes cultures :
- Céréales
- Légumes
- Vergers

Le programme permet de calculer :
- la production totale ;
- le besoin total en eau.

## Technologies utilisées

- Java
- Maven
- MySQL

## Structure du projet

- `Culture.java` : classe abstraite des cultures
- `Cereale.java` : gestion des céréales
- `Legume.java` : gestion des légumes
- `Verger.java` : gestion des vergers
- `Irrigable.java` : interface pour les cultures irrigables
- `Cultures.java` : gestion de la liste des cultures
- `Connexion.java` : connexion à MySQL
- `Main.java` : programme principal
- `database/gestion_cultures.sql` : création de la base de données

## Installation

1. Installer Java.
2. Installer MySQL.
3. Créer la base de données avec le fichier SQL.
4. Modifier les informations de connexion dans `Connexion.java`.
5. Lancer le programme avec Maven.
