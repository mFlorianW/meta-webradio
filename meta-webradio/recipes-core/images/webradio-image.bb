# Image for the webradio os
include recipes-core/images/rpi-hwup-image.bb

# Add some distro features for this image
DISTRO_FEATURES_append = "systemd"

# Include modules in rootfs
IMAGE_INSTALL += " \
	packagegroup-core-full-cmdline \
"

