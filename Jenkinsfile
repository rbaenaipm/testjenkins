pipeline {

  agent any
 node {
  stage('Apply Kubernetes files') {
    withKubeConfig([credentialsId: 'test2', serverUrl: 'https://172.16.202.14:6443']) {
      sh 'kubectl get pods'
    }
  }
}
}
