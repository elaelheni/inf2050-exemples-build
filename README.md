# INF2050. Exemples de systèmes de build automatisés

## Prérequis

- VirtualBox: https://www.virtualbox.org/wiki/Downloads
- Vagrant: https://www.vagrantup.com/downloads.html
- git


## Installation initiale

À savoir: l'exécution de la commande `vagrant up` prend plusieurs minutes à se
compléter.

### Linux / MacOS 

Dans un terminal:

    $ git clone git@github.com:fxg42/inf2050-exemples-build.git
    $ cd inf2050-exemples-build
    $ vagrant up

### Windows 10

Dans Powershell ou cmder

    > git clone git@github.com:fxg42/inf2050-exemples-build.git
    > cd inf2050-exemples-build
    > vagrant.exe up


## Exécution du projet Maven

### Linux / MacOS 

    $ vagrant up
    $ cd /vagrant/projet-maven
    $ mvn test

### Windows 10

    > vagrant.exe ssh
    $ cd /vagrant/projet-maven
    $ mvn test
