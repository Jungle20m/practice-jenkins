pipeline {
    agent any 
    stages {
        stage('init') {
            steps {
                echo 'init' 
            }
        }
        stage('check images exist') {
            steps {
                echo 'check image exist' 
            }
        }
        stage('test') {
            steps {
                echo 'test' 
            }
        }
        stage('build & push') {
            steps {
                // This step should not normally be used in your script. Consult the inline help for details.
                withDockerRegistry(credentialsId: 'docker-hub', url: 'https://index.docker.io/v1/') {
                    sh 'docker build -t vietanhd14cn7/jenkins-practice:v1 -f deploy/Dockerfile .'
                    sh 'docker push vietanhd14cn7/jenkins-practice:v1'
                }
            }
        }
        stage('deployment') {
            steps {
                echo 'deployment' 
            }
        }
    }
}
