#!/usr/bin/env groovy

def call() {
    return new Docker(this).dockerLogin()
}
