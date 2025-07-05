def call(){
    dependencyCheck additionalArguments: '--scan ./',odcInstallation:'OWASP' 
    dependencyCheckPublisher pattern: '**/wanderlust-dpcheck-report.xml'
}
