def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([uernamePassword(credentialsId:'dockerHubCred', passwordVariable: 'dockerHubpass', usernameVariable: 'dockerHubUser')]){
    sh 'docker loginv-u ${dockerhubuser} -p ${dockerhubpass}'
  }
  sh 'docker push ${dockerhubuser}/${Project}:${ImageTag}'
}
