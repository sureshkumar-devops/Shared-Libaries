def call(String ProjectName, String ImageTag, String DockerHubUser){
    sh 'docker rmi ${DockerHubUser}/${ProjectName}:${ImageTag}'
}