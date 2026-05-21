pipeline {
    agent any

    triggers {
        pollSCM('H/2 * * * *')
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Run Selenium Tests') {
            steps {
                sh '/opt/homebrew/bin/mvn test -Dheadless=true'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
        }
        failure {
            echo 'Tests failed. Check the test report above.'
        }
        success {
            echo 'All tests passed.'
        }
    }
}
