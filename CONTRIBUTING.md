# Guide de Contribution

Merci de contribuer à ce projet ! Pour participer efficacement dans ce projet, nous vons invitons à lire le document suivant.

---

## Table des matières

1. [Code de Conduite](#code-de-conduite)
2. [Comment Contribuer](#comment-contribuer)
3. [Configuration du Projet](#configuration-du-projet)
4. [Règles de Développement](#règles-de-développement)
5. [Proposer une Modification](#proposer-une-modification)
6. [Signaler un Problème](#signaler-un-problème)

---

## Code de Conduite

Nous nous engageons à maintenir un environnement respectueux. Veuillez lire notre [Code de Conduite](CODE_OF_CONDUCT.md) avant de contribuer.

---

## Comment Contribuer

### Types de contributions :

- Signaler des bugs.
- Proposer de nouvelles fonctionnalités.
- Améliorer la documentation.
- Corriger des problèmes existants dans le code.

---

## Configuration du Projet

1. **Clonez le dépôt** :
   ```bash
   git clone https://github.com/irvyncsm/TP_ORDER_FLOW.git
   cd TP_ORDER_FLOW
   ```

2. **Installez les dépendances** :
   ```bash
   cd .devcontainer
   docker build -t nom-image
   docker run nom-image
   ```

---

## Règles de Développement

- **Respectez les conventions de code** : Utilisez les règles définies dans `.eslintrc` ou `.prettierrc`.
- **Créez des branches claires** : Travaillez sur une branche distincte pour chaque fonctionnalité ou correctif. Exemple :
  ```bash
  git checkout -b feature/ma-nouvelle-fonctionnalite
  ```

- **Rédigez des messages de commit explicites** :
  - ✅ `feat: Ajouter le formulaire de contact`
  - ✅ `fix: Corriger un bug dans le menu de navigation`
  - ✅ `+ ajout un menu latéral`

---

## Proposer une Modification

1. **Assurez-vous que votre branche est à jour** :
   ```bash
   git pull origin main
   ```

2. **Poussez votre branche** :
   ```bash
   git push origin feature/ma-nouvelle-fonctionnalite
   ```

3. **Créez une Pull Request** :
   - Allez sur [notre dépôt GitHub](https://github.com/irvyncsm/TP_ORDER_FLOW.git).
   - Cliquez sur "New Pull Request".
   - Suivez le modèle de Pull Request.

---

## Signaler un Problème

Pour signaler un bug ou suggérer une amélioration :
1. Ouvrez un [ticket GitHub](https://github.com/irvyncsm/TP_ORDER_FLOW.git).
2. Fournissez des détails clairs, notamment :
   - Étapes pour reproduire le problème.
   - Résultat attendu vs résultat observé.
   - Capture d’écran (si applicable).


