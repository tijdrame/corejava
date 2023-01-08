package com.emard.java15.sealed.record;

public sealed interface Employee permits Doctor, Nurse {
}
