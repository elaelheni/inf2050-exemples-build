Vagrant.configure("2") do |config|
  config.vm.box = "hashicorp/bionic64"
  config.vm.provision "shell", inline: <<-SHELL

    ## Installation de Java
    wget -qO - https://adoptopenjdk.jfrog.io/adoptopenjdk/api/gpg/key/public | sudo apt-key add -
    sudo add-apt-repository --yes https://adoptopenjdk.jfrog.io/adoptopenjdk/deb/
    apt-get -y install adoptopenjdk-11-hotspot
    echo 'export JAVA_HOME=/usr/lib/jvm/adoptopenjdk-11-hotspot-amd64' >> .bashrc

    ## Installation de Maven
    sudo wget -qP /opt http://mirror.its.dal.ca/apache/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz
    sudo tar xzf /opt/apache-maven-3.6.3-bin.tar.gz -C /opt
    echo 'export M2_HOME=/opt/apache-maven-3.6.3' >> .bashrc
    echo 'PATH=$PATH:$M2_HOME/bin' >> .bashrc

    ## Installation de Ant
    sudo wget -qP /opt http://mirror.dsrg.utoronto.ca/apache//ant/binaries/apache-ant-1.10.7-bin.tar.gz
    sudo tar xzf /opt/apache-ant-1.10.7-bin.tar.gz -C /opt
    echo 'export ANT_HOME=/opt/apache-ant-1.10.7' >> .bashrc
    echo 'PATH=$PATH:$ANT_HOME/bin' >> .bashrc

    ## Installation de Ivy comme une dépendant de Ant
    sudo wget -qP /opt http://httpd-mirror.sergal.org/apache//ant/ivy/2.5.0/apache-ivy-2.5.0-bin.tar.gz
    sudo tar xzf /opt/apache-ivy-2.5.0-bin.tar.gz -C /opt
    sudo cp /opt/apache-ivy-2.5.0/ivy-2.5.0.jar /opt/apache-ant-1.10.7/lib

    ## Installation de jUnit5 comme une dépendant de Ant
    sudo wget -qP /opt/apache-ant-1.10.7/lib/ https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.6.0/junit-platform-console-standalone-1.6.0.jar

    ## Installation de Gradle
    sudo apt-get install -y unzip
    sudo wget -qP /opt https://services.gradle.org/distributions/gradle-5.6.4-bin.zip
    sudo unzip -q /opt/gradle-5.6.4-bin.zip -d /opt
    echo 'export GRADLE_HOME=/opt/gradle-5.6.4' >> .bashrc
    echo 'PATH=$PATH:$GRADLE_HOME/bin' >> .bashrc
  SHELL
end
