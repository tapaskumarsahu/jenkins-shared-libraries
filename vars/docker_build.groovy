def call(String ProjectName, String ImageTag, String DockerHubUser){
  sh sh 'docker build -t ${DockerHubUser}/${ProjeetName}:${ImageTag} .'
}
