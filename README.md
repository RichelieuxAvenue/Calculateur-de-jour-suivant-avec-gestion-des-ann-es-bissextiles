# Calculateur-de-jour-suivant-avec-gestion-des-ann-es-bissextiles
Ce projet Java est un programme qui permet de calculer la date du jour suivant à partir d’une date donnée par l’utilisateur (sous forme de jour, mois et année). Il prend en compte les mois ayant différents nombres de jours (28, 30, ou 31) et gère correctement les années bissextiles.

	Fonctionnalités :

		•	L’utilisateur saisit une date sous la forme de trois entiers : jour, mois et année (compris entre 1900 et 2400).
	•	Le programme vérifie la validité du nombre de jours en fonction du mois et de l’année.
	•	Il gère correctement les années bissextiles, en prenant en compte février avec 28 ou 29 jours selon l’année.
	•	Affiche la date du jour suivant avec une mise en forme claire.

	Technologies utilisées :

		•	Java
	•	JOptionPane pour l’interaction avec l’utilisateur (saisie de la date et affichage du résultat)
	•	Gestion des années bissextiles selon les règles standards

	Objectifs pédagogiques :

	Ce projet fait partie de ma formation en développement d’applications, et son objectif est de démontrer mes compétences dans :

		•	La gestion des conditions et des boucles en Java
	•	L’utilisation d’interfaces utilisateur simples pour interagir avec l’utilisateur
	•	La validation d’entrées utilisateur et la gestion des erreurs
	•	La manipulation des dates, en particulier le calcul du jour suivant

	Exécution :

		•	L’utilisateur entre une date (par exemple, 31/12/2021), et le programme affichera le jour suivant (dans cet exemple, le 01/01/2022).
	•	Le programme gère également des dates comme le 28/02 dans une année bissextile (2024), et proposera le 29/02/2024, ou le 01/03 dans une année non-bissextile (2023).
