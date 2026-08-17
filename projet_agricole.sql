CREATE DATABASE projet_agricole;

USE projet_agricole;

CREATE TABLE cultures 
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    type VARCHAR(50) NOT NULL,
    surface DOUBLE NOT NULL,
    rendement DOUBLE NOT NULL,
    recolte_manuelle BOOLEAN,
    nombre_arbres INT
);

INSERT INTO cultures
(nom, type, surface, rendement, recolte_manuelle, nombre_arbres)
VALUES
('Avoine', 'Cereale', 10, 3, NULL, NULL),
('Tomate', 'Legume', 5, 2, TRUE, NULL),
('Oranger', 'Verger', 2, 1.5, NULL, 100),
('Carotte', 'Legume', 3, 1.8, FALSE, NULL),
('Blé', 'Cereale', 8, 4, NULL, NULL);