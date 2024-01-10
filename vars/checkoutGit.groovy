def call() {
    checkout([
        $class: 'GitSCM',
        branches: [[name: 'main']],
        userRemoteConfigs: [[url: 'https://github.com/Niketanjenekar/Jenkins_shared_library.git']]
    ])
}
