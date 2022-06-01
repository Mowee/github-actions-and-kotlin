#!/usr/bin/env kotlin

import java.io.File

// list directories
File(".").listFiles { file -> file.isDirectory }?.forEach { folder -> println(folder) }