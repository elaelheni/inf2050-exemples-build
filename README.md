# INF2050. Exemples de systèmes de build automatisés

## Prérequis

- VirtualBox: https://www.virtualbox.org/wiki/Downloads
- Vagrant: https://www.vagrantup.com/downloads.html
- git


## Installation initiale

*Attention* : l'exécution de la commande `vagrant up` prend plusieurs minutes à se
compléter.

### Linux / MacOS 

Dans un terminal:

    $ git clone https://github.com/fxg42/inf2050-exemples-build.git
    $ cd inf2050-exemples-build
    $ vagrant up

### Windows 10

Dans Powershell ou cmder

    > git clone https://github.com/fxg42/inf2050-exemples-build.git
    > cd inf2050-exemples-build
    > vagrant.exe up


## Exécution du projet Maven

*Info* : la toute première exécution de la commande `mvn` prend quelques minutes à se
compléter.

### Linux / MacOS 

    $ vagrant ssh
    vagrant@vagrant$ cd /vagrant/projet-maven
    vagrant@vagrant$ mvn test

### Windows 10

    > vagrant.exe ssh
    vagrant@vagrant$ cd /vagrant/projet-maven
    vagrant@vagrant$ mvn test


## Autres commandes

Pour sortir de la machine de la machine virtuelle:

    vagrant@vagrant$ exit

Pour supprimer la machine virtuelle et libérée l'espace disque:

    $ vagrant destroy

ou, en Windows:

    > vagrant.exe destroy
