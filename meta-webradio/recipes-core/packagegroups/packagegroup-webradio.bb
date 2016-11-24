SUMMARY = "Provides a small set of tools for development on the device"
LICENSE = "MIT"

PR = "r1"

inherit packagegroup

RDEPENDS_${PN} = " \
    packagegroup-qt5-toolchain-target \
"