/*
 * SonarLint for Eclipse
 * Copyright (C) 2015 SonarSource
 * sonarlint@sonarsource.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonarlint.eclipse.jdt.internal;

import java.util.LinkedHashSet;
import java.util.Set;
import org.sonarlint.eclipse.core.configurator.ProjectConfiguration;

public class JavaProjectConfiguration extends ProjectConfiguration {

  private final Set<String> libraries = new LinkedHashSet<>();
  private final Set<String> binaries = new LinkedHashSet<>();

  public Set<String> libraries() {
    return libraries;
  }

  public Set<String> binaries() {
    return binaries;
  }
}