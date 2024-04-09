#!/bin/bash

.PHONY: genproto

genproto:
	buf generate && buf generate --template buf.gen.tag.yaml
