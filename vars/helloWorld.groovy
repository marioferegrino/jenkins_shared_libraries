def call(Map config = [:]) {
    print("Hello ${config.name} today is: ${config.date}")
}

def say_hi() {
    print("Hi Jenkins")
}