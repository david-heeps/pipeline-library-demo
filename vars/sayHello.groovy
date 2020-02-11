#!/usr/bin/env groovy

def call(Map config) {
  git url: "https://github.com/david-heeps/${config.name}-worldpub"
}

