def call(String SonarQubeAPI, String Projectname, String Projectkey){
    withSonarQubeEnv("${SonarQubeAPI}"){
    sh "$scanner_home/bin/sonar-scanner -Dsonar.projectName=${Projectname} -Dsonar.projectKey=${Projectkey} -X"
  }
}