def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([uernamePassword(credentialsId:'docker', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]){
    sh 'docker loginv-u ${dockerhubuser} -p ${dockerhubpass}'
  }
  sh 'docker push ${dockerhubuser}/${Project}:${ImageTag}'
}
