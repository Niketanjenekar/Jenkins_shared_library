def call() {
    withSonarQubeEnv('sonar') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=Youtube-clone -Dsonar.projectKey=Youtube-clone '''
    }
}
