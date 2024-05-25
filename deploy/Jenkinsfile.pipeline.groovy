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
                echo 'build & push' 
            }
        }
        stage('deployment') {
            steps {
                echo 'deployment' 
            }
        }
    }
}
