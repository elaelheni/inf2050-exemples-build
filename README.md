# INF2050. Exemples de systèmes de build automatisés

## :clipboard: Prérequis

- VirtualBox: https://www.virtualbox.org/wiki/Downloads
- Vagrant: https://www.vagrantup.com/downloads.html
- git: https://git-scm.com/downloads
- Les extensions de virtualisation (VT-x ou AMD-V) doivent être activées dans le
  BIOS de votre ordinateur.


## :wrench: Installation initiale

> :warning: L'exécution de la commande `vagrant up` prend plusieurs minutes à se
compléter.

### Linux / MacOS

Dans un terminal:

    $ git clone https://github.com/fxg42/inf2050-exemples-build.git
    $ cd inf2050-exemples-build
    $ vagrant up

### Windows 10

Dans cmd, powershell ou cmder

    > git clone https://github.com/fxg42/inf2050-exemples-build.git
    > cd inf2050-exemples-build
    > vagrant.exe up


## :rocket: Exécution du projet Maven

> :warning: La toute première exécution de la commande `mvn` prend quelques minutes à se
compléter.

### Linux / MacOS

    $ vagrant ssh
    vagrant@vagrant:~$ cd /vagrant/projet-maven
    vagrant@vagrant:/vagrant/projet-maven$ mvn test

### Windows 10

    > vagrant.exe ssh
    vagrant@vagrant:~$ cd /vagrant/projet-maven
    vagrant@vagrant:/vagrant/projet-maven$ mvn test


## :shell: Autres commandes

### Sortir de la machine virtuelle:

    vagrant@vagrant$ exit

### Supprimer la machine virtuelle et libérer l'espace disque:

#### Linux / MacOS

    $ vagrant destroy

#### Windows 10

    > vagrant.exe destroy


## :bomb: Troubleshooting

### VT-x is disabled in the BIOS for all CPU modes

Le message suivant peut subvenir lors de la première exécution de Vagrant:

    VBoxManage.exe: error: Not in a hypervisor partition (HVP=0) (VERR_NEM_NOT_AVAILABLE).
    VBoxManage.exe: error: VT-x is disabled in the BIOS for all CPU modes (VERR_VMX_MSR_ALL_VMX_DISABLED)

Les architectures Intel requièrent parfois l'activation des extensions de
virtualisation (VT-x) dans le BIOS de votre ordinateur. Vérifiez la
documentation du manufacturier pour savoir comment entrer dans le BIOS
(généralement en appuyant sur F2 ou F12 au boot). Vous pourrez alors activer
l'option.

L'option équivalente pour les architectures AMD (AMD-V) est habituellement déjà
activée et la modification du BIOS n'est pas nécessaire.


### The guest machine entered an invalid state while waiting for it to boot.

Ce message d'erreur vagrant peut apparaître pour différentes raisons.

Vérifiez d'abord que les extensions de virtualisation sont activées dans le
BIOS et que vous utilisez une version à jour de VirtualBox et que celle-ci est
adéquate pour votre système d'exploitation.

L'exécution de la commande `vagrant reload` peut être suffisante pour régler le
problème. L'exécution de `vagrant destroy` puis de `vagrant up` pourrait être
nécessaire.


## :tada: Remerciements

Un grand merci aux personnes qui m'ont aidées à tester cette preuve de concept!
(en ordre d'apparition dans le channel Slack):

- Alix JM
- Terry Dias
- Gaël Stébenne
- Sofiane
