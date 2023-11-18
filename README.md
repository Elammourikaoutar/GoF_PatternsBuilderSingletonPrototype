# GoF_PatternsBuilder Singleton & Prototype

Développer une application OO qui permet de gérer des comptes bancaires. Chaque Compte est défini par :
   - accountId de type String
   - balance de type double
   - currency : String
   - accountType : AccountType (SAVING_ACCOUNT, CURRENT_ACCOUNT)
   - accountStatus : AccountStatus (CREATED, ACTIVATED, BLOCKED, SUSPENDED)
Travail demandé :
  1. Crée la classe BankAccount
  2. Créer l'interface AccountRepository déclarant les opérations qui permettent de :
       - Ajoute run compte
       - Consulter tous les comptes
       - Consulter un compte sachant son id
       - Chercher un compte avec un prédicat quelconque
   3. Créer une implémentation (BankRepositoryImpl)de cette interface en stockant les comptes dans une collection de type HashMap.
   4. Implémenter le pattern Builder pour la classe Compte
   5. Implémenter le pattern Singleton pour créer une instance unique de BankRepositoryImpl
   6. Implémenter le pattern Prototype pour la classe Compte
   8. Appliquer d'autres design pattern utiles pour cette application


 * <strong style="color:pink">Voici une modélisation des designs pattern de notre projet </span>

      ![image](https://github.com/Elammourikaoutar/GoF_PatternsBuilderSingletonPrototype/assets/106027819/5fc7b8f7-fbb9-4a03-907b-c29b1f8a9c06)

      
 * <strong style="color:dark">Vous trouverez ci-aprés l'architecture du projet </span>

 ![image](https://github.com/Elammourikaoutar/GoF_PatternsBuilderSingletonPrototype/assets/106027819/08663394-9417-44f4-9783-668a05dd94d3)

  * <strong style="color:white">Voici l'exécution de la classe main du projet </span>
  
 ![image](https://github.com/Elammourikaoutar/GoF_PatternsBuilderSingletonPrototype/assets/106027819/0d2f195c-da77-4942-a875-6f3679e78514)

 ![image](https://github.com/Elammourikaoutar/GoF_PatternsBuilderSingletonPrototype/assets/106027819/3391bb4d-c903-449d-a411-4c7cf80fd811)


 * <strong style="color:dark">Voici l'exécution de la classe test du projet </span>
 
 ![image](https://github.com/Elammourikaoutar/GoF_PatternsBuilderSingletonPrototype/assets/106027819/8f805e11-8617-4d03-afea-23aa357e8b35)


