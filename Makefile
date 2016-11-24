BUILD_DIR?=${PWD}/build

all: piwebos

piwebos: init
	bash -c ". poky/oe-init-build-env $(BUILD_DIR) && bitbake webradio-image"

init: 
	mkdir -p $(BUILD_DIR)/conf
	cp $(PWD)/default.conf $(BUILD_DIR)/conf/local.conf
	cp $(PWD)/default.layers $(BUILD_DIR)/conf/bblayers.conf

clean:
	rm -rf $(BUILD_DIR)