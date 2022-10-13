pipeline{
    agent any{
    stages{
        stage('Entrado en carpeta kpack'){
            steps{
                 sh 'cd kpack'
              }

            }
        stage("Creando service account"){
            steps{
                sh 'kubectl apply -f service-account.yaml'
            }
        }
        }
    }
}

