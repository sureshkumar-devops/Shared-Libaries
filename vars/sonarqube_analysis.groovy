def call(String SonarQubeAPI, String ProjectName, String ProjectKey){
    withSonarQubeEnv("${SonarQubeAPI}"){
    sh "$scanner_home/bin/sonar-scanner -Dsonar.projectName=${ProjectName} -Dsonar.projectKey=${ProjectKey} -Dsonar.java.binaries=."
  }
}